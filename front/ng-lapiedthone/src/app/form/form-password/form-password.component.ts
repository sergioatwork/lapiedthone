import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-password',
  template: '<input class="form-control" id="formPwd" type="password" placeholder="Mot de Passe" [formControl]="formPwd">',
//   templateUrl: './form-password.component.html',
//   styleUrls: ['./form-password.component.scss']
})
export class FormPasswordComponent {
	formPwd = new FormControl('');
}
