import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-form-email',
  template: '<input class="form-control" type="text" placeholder="Email" [formControl]="formEmail">',
  // templateUrl: './form-email.component.html',
  // styleUrls: ['./form-email.component.scss']
})
export class FormEmailComponent {
  formEmail = new FormControl('');
}
