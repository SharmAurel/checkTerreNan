import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators, NgForm } from '@angular/forms';
import { User } from '../../model/user';
import { UserService } from '../../user.service';


@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.scss']
})
export class AddUserComponent implements OnInit {

userDetail !: FormGroup;
userUsr: User = new User();
userList: User[] = [];

 

constructor(private formBuilder: FormBuilder, private userService: UserService) { }

ngOnInit(): void {
  this.getAllUser();
  this.userDetail = this.formBuilder.group({
    id : [''],
    nom : [''],
    prenom : [''],
    mdp : [''],
    username : [''],
  });
}

addUser(addForm: NgForm) {
 this.userService.addUser(addForm.value).subscribe(res => {
    this.getAllUser();
    addForm.reset();
  }, err => {
    console.log(err);
  });
}


getAllUser() {
  this.userService.getAllUser().subscribe(res => {
    console.log(res);
    this.userList = res;
  }, err => {
    console.log("error while fetching data.")
  });
}
}


