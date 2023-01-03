import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActualiteComponent } from './actualite/actualite.component';
import { PresentationComponent } from './presentation/presentation.component';
import { TemoignageComponent } from './temoignage/temoignage.component';
import { PhotoComponent } from './photo/photo.component';
import { ReglementComponent } from './reglement/reglement/reglement.component';
// import { PageNotFoundComponent } from "./page-not-found.component/page-not-found.component";


const routes: Routes = [
  // Routes
  { path: '', redirectTo: 'actualite', pathMatch: 'full' },
  { path: 'actualite', component: ActualiteComponent },
  { path: 'presentation', component: PresentationComponent },
  { path: 'temoignage', component: TemoignageComponent },
  { path: 'photo', component: PhotoComponent },
  { path: 'reglement', component: ReglementComponent },
  // { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
