import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PresentationComponent } from './presentation/presentation.component';
import { ReglementComponent } from './reglement/reglement.component';

import { AccueilRoutingModule } from './accueil-routing.module';

@NgModule({
  declarations: [
    PresentationComponent,
    ReglementComponent,
  ],
  imports: [
    CommonModule,
    AccueilRoutingModule
  ]
})
export class AccueilModule { }
