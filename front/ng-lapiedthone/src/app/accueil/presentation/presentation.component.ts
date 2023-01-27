import { Component } from '@angular/core';
import { Global } from '../../global';

@Component({
  selector: 'app-presentation',
  templateUrl: './presentation.component.html',
  styleUrls: ['./presentation.component.scss']
})
export class PresentationComponent {

  constructor(public g: Global) {}

}
