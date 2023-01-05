import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ActualiteComponent } from "./actualite/actualite.component";
import { PresentationComponent } from "./presentation/presentation.component";
import { TemoignageComponent } from "./temoignage/temoignage.component";
import { PhotoComponent } from "./photo/photo.component";
import { ReglementComponent } from "./reglement/reglement.component";

const routes: Routes = [
    // Routes
    { 
        path: 'accueil',
        children: [
            { path: 'actualite', component: ActualiteComponent },
            { path: 'presentation', component: PresentationComponent },
            { path: 'temoignage', component: TemoignageComponent },
            { path: 'photo', component: PhotoComponent },
            { path: 'reglement', component: ReglementComponent },
        ]
    }
];

@NgModule({
    imports: [
        RouterModule.forChild(routes)
    ],
    exports: [
        RouterModule
    ]

})

export class AccueilRoutingModule {}