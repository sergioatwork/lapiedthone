import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Global } from '../global';
import { User } from '../_model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(public g: Global, private http: HttpClient) {}

  private userUrl: string  = this.g.serverBackend + '/user';

  getAllUser() : Observable<User[]> {
    console.log(this.userUrl + '/read');
    return this.http.get<User[]>(this.userUrl + '/read');
  }

  getOneUser(id: number) : Observable<User> {
    console.log(this.userUrl + '/read/' + id);
    return this.http.get<User>(this.userUrl + '/read' + id);
  }

  postCreateUser(user: User) : Observable<boolean> {
    console.log(this.userUrl + '/create');
    return this.http.post<boolean>(this.userUrl + '/create/', user);
  }

  putUpdateUser(user: User) : Observable<boolean> {
    console.log(this.userUrl + '/update');
    return this.http.put<boolean>(this.userUrl + '/update/', user);
  }

  patchEnableUser(id: number) : Observable<boolean> {
    console.log(this.userUrl + '/enable/' + id);
    return this.http.patch<boolean>(this.userUrl + '/enable/' + id, '');
  }

  patchDisableUser(id: number) : Observable<boolean> {
    console.log(this.userUrl + '/disable/' + id);
    return this.http.patch<boolean>(this.userUrl + '/disable/' + id, '');
  }

  deleteUser(id: number) : Observable<boolean> {
    console.log(this.userUrl + '/delete/' + id);
    return this.http.delete<boolean>(this.userUrl + '/delete/' + id);
  }

  postResetPwUser(email: String) : Observable<boolean> {
    console.log(this.userUrl + '/reset');
    return this.http.post<boolean>(this.userUrl + '/reset/', email);
  }
  
}
