import { Component, OnInit } from '@angular/core';
import { Router, } from '@angular/router';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
	styleUrls: ['./app.component.scss']
})

export class AppComponent implements OnInit {

	private urlRoute: string = 'abc';
	public pageAccueil: boolean = true;

	constructor(
		private router: Router) { }

	ngOnInit(): void {
		this.router.events.subscribe(event => {
			this.urlRoute = this.router.url.toString();
			// console.log(this.urlRoute);
			if (this.urlRoute.startsWith('/user') || this.urlRoute.startsWith('/admin')) { this.pageAccueil = false; } else { this.pageAccueil = true; }
		});
	}
}
