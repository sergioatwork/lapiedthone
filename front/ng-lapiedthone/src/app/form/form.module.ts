import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FormEmailComponent } from './form-email/form-email.component';

import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    FormEmailComponent,
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
  ],
  exports: [
    FormEmailComponent,
  ]
})
export class FormModule { }
