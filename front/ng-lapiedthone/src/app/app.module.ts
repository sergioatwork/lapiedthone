import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AccueilModule } from './accueil/accueil.module';
import { RsModule } from './rs/rs.module';
import { UserModule } from './user/user.module';
import { AdminModule } from './admin/admin.module';
import { AccueilRoutingModule } from './accueil/accueil-routing.module';
import { UserRoutingModule } from './user/user-routing.module';
import { AdminRoutingModule } from './admin/admin-routing.module';
import { AppRoutingModule } from './app-routing.module';
import { ReactiveFormsModule } from '@angular/forms';

import { Global } from './global';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AccueilModule,
    RsModule,
    UserModule,
    AdminModule,
    AccueilRoutingModule,
    UserRoutingModule,
    AdminRoutingModule,
    AppRoutingModule,
    ReactiveFormsModule,
  ],
  providers: [
    Global,
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
