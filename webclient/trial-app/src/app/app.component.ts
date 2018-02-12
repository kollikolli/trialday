import { Component } from '@angular/core';
import { AngularFireDatabase } from 'angularfire2/database';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  query = ""
  items: Observable<any[]>;
  db: AngularFireDatabase

  constructor(db: AngularFireDatabase) {
    this.db = db
    this.items = db.list('fact',  ref => ref.orderByChild("user").startAt(this.query)).valueChanges()
  }

  queryItems() {
    this.items = this.db.list('fact',  ref => ref.orderByChild("user").startAt(this.query)).valueChanges()
  }
}
