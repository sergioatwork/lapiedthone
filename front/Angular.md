# ANGULAR

### Installation de Angular

npm install -g @angular/cli

### Création de l'application

ng new ng-nom_pplication      *par convention, le répertoire du nom de l'application commence par ng-*

ng update

### Compile l'application et démarre un serveur

cd répertoire_du_projet
ng serve --open      *l'option --open permet d'ouvrirautomatiquement le navigateur*

http://localhost:4200/

### Création de module

ng generate module nom_module
ng g m nom_module

### Création de composant

*Création avec le nom du composant*
* - répertoire*
* - fichier html*
* - fichier css ou scss*
* - fichier ts*
*Déclaration dans app.module.ts*

ng generate component nom_composant
ng g c nom_composant

### Création de service

ng generate service nom_service
ng g s nom_service

### tsconfig.json

"strictPropertyInitialization": false
"strictNullChecks":false

### app.module.ts

@NgModule({
  declarations: [
    AppComponent,
    *Directives*
    *Pipes*
  ],
  imports: [
    BrowserModule,
    *ModulesEnfants,*      *Modules que l'on crée*
    AppRoutingModule,      *Module pour utiliser les Routes*
    HttpClientModule,      *Module pour utiliser HttpClient*
    FormsModule,           *Module pour utiliser les formulaires*

    HttpClientInMemoryWebApiModule.forRoot(InMemoryDataService, { dataEncapsulation: false }) *Module*

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

### app.component.html

Interpolation = {{ }}
Intéraction Angular = [ ]
Evènement = ()
Boxing = #

<balise_html *ngIf="Boolean">...</balise_html>

<balise_html *ngFor="let item of collection_items">{{ item }}</balise_html>

#### app.component.ts

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',      *HTML associé au composant*
  styleUrls: ['./app.component.scss']      *CSS associé au composant*
})

ngOnInit      *Initialisation de la classe (constructeur...), cycle de vie...*

constructor(){}      *Injection de dépendances*

### directive.ts

@Directive({
    selector: '[pkmnBorderCard]'
})

### Pippes

https://angular.io/guide/pipes

{{ propiété | pipe }}

### Formulaire

*Ajouter dans le fichier ...module.ts du répertoire parent du formulaire*
imports: [
    FormsModule
  ],

### HTTP

GET = Récupération
POST = Insertion
PUT = Mise à jour
DELETE = Suppression

### Authentification

auth.service.ts
auth-guard.service.ts