import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

import { BrowserModule } from '@angular/platform-browser';
import { AccueilModule } from './accueil/accueil.module';
import { RsModule } from './rs/rs.module';
import { AccueilRoutingModule } from './accueil/accueil-routing.module';
import { UserRoutingModule } from './user/user-routing.module';
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
    AccueilModule,
    RsModule,
    AccueilRoutingModule,
    UserRoutingModule,
    AppRoutingModule,
    ReactiveFormsModule,
  ],
  providers: [
    Global,
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
