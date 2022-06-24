import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from 'src/app/model/user';

export class UserService {

  UserURL: string;

  constructor(private http: HttpClient) { 
    this.UserURL = 'http://localhost:8080/user';
  }  

  addUser(user: User): Observable<User> {
    return this.http.post<User>(this.UserURL, user);
  }

  getAllUser(): Observable<User[]> {
    return this.http.get<User[]>(this.UserURL);
  }

  
  updateUser(User : User,pc : User): Observable<User[]> {
    return this.http.put<User[]>(this.UserURL+'/'+User.id, User);
  }

  
  deleteUser(User : User): Observable<User> {
    return this.http.delete<User>(this.UserURL+'/'+User.id)
  }
}