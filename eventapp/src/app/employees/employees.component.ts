import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { map } from 'rxjs/operators';
import Swal from 'sweetalert2';
import { EmployeeData } from './employeedata.model';

@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css'],
})
export class EmployeesComponent implements OnInit {
  fetchedEmployees: EmployeeData[] = [];
  empDetails: EmployeeData[] = [];

  backendurl = 'http://localhost:3000/employees';

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.fetchPosts();
  }

  onCreatePost(postData: { title: string; content: string }, form: NgForm) {
    this.http.post(this.backendurl, postData).subscribe((responseData) => {
      console.log(responseData);
      this.fetchPosts();
      form.reset();
    });
  }
  onFetchPosts() {
    this.fetchPosts();
  }
  onDelete(id: number) {
    this.http.delete(this.backendurl + '/' + id).subscribe((response) => {
      console.log('Employee deleted: ' + response);
      this.fetchPosts();
    });
  }
  onDetails(eid: number) {
    this.http
      .get(this.backendurl + '/' + eid)
      .pipe(
        map((responseData: any) => {
          const empArray: EmployeeData[] = [];

          var x = { ...responseData };
          empArray.push(x);

          return empArray;
        })
      )
      .subscribe((response) => {
        this.empDetails = response;
        console.log('Employee details: ' + this.empDetails);
      });
  }

  fetchPosts() {
    this.http
      .get(this.backendurl)
      .pipe(
        map((responseData: any) => {
          const postsArray: EmployeeData[] = [];
          for (const key in responseData) {
            var x = { ...responseData[key] };
            postsArray.push(x);
          }
          return postsArray;
        })
      )
      .subscribe((posts) => {
        this.fetchedEmployees = posts;
      });
  }
}
