import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
// import { AuthGuardService } from "../auth-guard.service";
import { UserCreateComponent } from "./user-create/user-create.component";
import { UserDisplayComponent } from "./user-display/user-display.component";
import { UserEditComponent } from "./user-edit/user-edit.component";
import { UserListComponent } from "./user-list/user-list.component";
import { UserLoginComponent } from "./user-login/user-login.component";

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
            { path: 'create', component: UserCreateComponent },
            { path: 'login', component: UserLoginComponent },
            { path: 'list', component: UserListComponent },
            { path: 'display', component: UserDisplayComponent },
            { path: 'edit/:id', component: UserEditComponent },
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

export class UserRoutingModule {}
