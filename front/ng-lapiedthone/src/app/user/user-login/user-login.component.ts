import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';

import { Global } from '../../global';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.scss']
})
export class UserLoginComponent {

  constructor(public g: Global) {}

  formEmail = new FormControl('');
  formPwd = new FormControl('');

  submitLogin() {
    console.log("ID : " + this.formEmail.value);
    console.log("MDP : " + this.formPwd.value);
  }
  
  forgotPassword() {
    console.log("Aller à Mot de passe oublié");
  }
}
