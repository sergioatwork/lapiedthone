import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserComponent } from './user.component';
import { UserRoutingModule } from './user-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { FormModule } from '../form/form.module';
import { UserCreateComponent } from './user-create/user-create.component';
import { UserDeleteComponent } from './user-delete/user-delete.component';
import { UserDisplayComponent } from './user-display/user-display.component';
import { UserEditComponent } from './user-edit/user-edit.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserLoginComponent } from './user-login/user-login.component';

@NgModule({
  declarations: [
    UserComponent,
    UserCreateComponent,
    UserDeleteComponent,
    UserDisplayComponent,
    UserEditComponent,
    UserListComponent,
    UserLoginComponent,
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    FormModule,
    FormsModule,
    ReactiveFormsModule,
  ]
})
export class UserModule { }
