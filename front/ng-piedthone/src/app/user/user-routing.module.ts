import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
// import { AuthGuardService } from "../auth-guard.service";
import { CreateComponent } from "./create/create.component";
import { LoginComponent } from "./login/login.component";

const routes: Routes = [
    // Routes
    // { path: 'pokemon/all', component: ListPokemonComponent },
    // { path: 'pokemon/edit/:id', component: EditPokemonComponent },
    // { path: 'pokemon/delete/:id', component: DeletePokemonComponent },
    // { path: 'pokemon/:id', component: DetailPokemonComponent }

    { 
        path: 'user',
        // canActivate: [AuthGuardService],
        children: [
            { path: 'create', component: CreateComponent },
            { path: 'login', component: LoginComponent },
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

export class UserRoutingModule {

}