import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { FormEmailComponent } from 'src/app/form/form-email/form-email.component';

import { Global } from '../../global';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(public g: Global) {}

  mdp = new FormControl('');

}
