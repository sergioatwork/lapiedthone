import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FormEmailComponent } from './form-email/form-email.component';
import { FormPasswordComponent } from './form-password/form-password.component';

import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    FormEmailComponent,
    FormPasswordComponent,
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
  ],
  exports: [
    FormEmailComponent,
    FormPasswordComponent,
  ]
})
export class FormModule { }
