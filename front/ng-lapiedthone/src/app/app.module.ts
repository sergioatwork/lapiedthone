import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

import { AccueilRoutingModule } from './accueil/accueil-routing.module';
import { UserRoutingModule } from './user/user-routing.module';
import { AppRoutingModule } from './app-routing.module';
import { AccueilModule } from './accueil/accueil.module';
import { RsModule } from './rs/rs.module';

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
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
