import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from 'src/app/_model/user';

@Component({
	selector: 'app-user-edit',
	templateUrl: './user-edit.component.html',
	styleUrls: ['./user-edit.component.scss']
})
export class UserEditComponent {

	user: User = new User();

	constructor(private route: ActivatedRoute) { }

	ngOnInit(): void {
		this.user.id = Number(this.route.snapshot.paramMap.get('id'));
	}

}
