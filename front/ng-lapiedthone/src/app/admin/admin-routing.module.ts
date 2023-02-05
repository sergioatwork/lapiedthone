import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
// import { AuthGuardService } from "../auth-guard.service";
import { UserDisplayComponent } from '../user/user-display/user-display.component';
import { UserListComponent } from '../user/user-list/user-list.component';
import { AdminComponent } from './admin.component';

const routes: Routes = [
  { 
      path: 'admin',
      // canActivate: [AuthGuardService],
      children: [
          { path: '', component: AdminComponent },
          { path: 'userList', component: UserListComponent },
          { path: 'userDisplay', component: UserDisplayComponent },
      ]
  }
];

@NgModule({
  declarations: [],
  imports: [
      RouterModule.forChild(routes)
  ],
  exports: [
      RouterModule
  ]

}) 

export class AdminRoutingModule { }
