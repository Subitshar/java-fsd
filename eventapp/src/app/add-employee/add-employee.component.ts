import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { EmployeeData } from '../employees/employeedata.model';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css'],
})
export class AddEmployeeComponent implements OnInit {
  fetchedPosts: EmployeeData[] = [];
  backendurl = 'http://localhost:3000/employees';
  constructor(private http: HttpClient) {}

  ngOnInit(): void {}
  onCreatePost(postData: { title: string; content: string }, form: NgForm) {
    this.http.post(this.backendurl, postData).subscribe((responseData) => {
      console.log(responseData);
      form.reset();
    });
  }
}
