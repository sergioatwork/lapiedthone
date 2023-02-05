import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../../_model/user';
import { UserService } from '../user.service';

@Component({
	selector: 'app-user-list',
	templateUrl: './user-list.component.html',
	styleUrls: ['./user-list.component.scss']
})
export class UserListComponent {

	constructor(private userService: UserService, private router: Router) { }

	userList: User[] = [];
	resultRq: boolean = false;

	ngOnInit(): void {
		this.userService.getAllUser().subscribe(data => {this.userList = data;});		
	}

	updateUser(user: User): boolean {
		this.userService.putUpdateUser(user).subscribe(data => {this.resultRq = data;});
		return this.resultRq;
	}

	enableUser(id: number): boolean {
		this.userService.patchEnableUser(id).subscribe(data => {this.resultRq = data;});
		return this.resultRq;
	}

	disableUser(id: number): boolean {
		this.userService.patchDisableUser(id).subscribe(data => {this.resultRq = data;});
		return this.resultRq;
	}

	deleteUser(id: number): boolean {
		this.userService.deleteUser(id).subscribe(data => {this.resultRq = data;});
		return this.resultRq;
	}

	resetPwUser(email: String): boolean {
		this.userService.postResetPwUser(email).subscribe(data => {this.resultRq = data;});
		return this.resultRq;
	}

	editUser(id: number) {	
		this.router.navigate(['/user/edit/', id]);
	}

}
