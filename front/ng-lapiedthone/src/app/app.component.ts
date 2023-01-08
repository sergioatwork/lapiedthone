import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router, UrlSegment } from '@angular/router';
import { map, Observable } from 'rxjs';
import { switchMap } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  
  constructor(
    private routeActuelle: ActivatedRoute,
    private router: Router) {
      
    }

  title = 'La Piedthone';

  
  // private urlRoute: Observable<string> = this.routeActuelle.url.pipe(map(segments => segments.join('')));
  private urlRoute: string = '';
  public pageAccueil: boolean = true;

  ngOnInit(): void {
    
    // this.routeActuelle.fragment.subscribe(url => { this.urlRoute = url ?? 'abc'; console.warn(url) });
    // this.routeActuelle.snapshot.url[0].path;
    // this.urlRoute = this.routeActuelle.toString() ?? 'abc';
    this.urlRoute = this.router.routerState.snapshot.url;
    console.log(this.urlRoute);

    // // this.urlRoute = this.routeactuelle.snapshot.params;
    // this.urlRoute = this.router.url;
    // console.log(this.urlRoute);

    // this.routeactuelle.queryParams.subscribe(params => {
    //   this.urlRoute = params;

    // console.log(this.urlRoute);
    // });
  }

  affichagers() {
    this.pageAccueil = !this.pageAccueil;
    console.log(this.pageAccueil);
  }

}
