import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RsComponent } from './rs.component';
import { TwitterComponent } from './twitter/twitter.component';
import { FacebookComponent } from './facebook/facebook.component';



@NgModule({
  declarations: [
    RsComponent,
    TwitterComponent,
    FacebookComponent,
  ],
  imports: [
    CommonModule
  ],
  exports:[
    RsComponent
  ]
})
export class RsModule { }
