import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Family } from '../shared/models/family.model';
import { Father } from '../shared/models/father.model';
import { Child } from '../shared/models/child.model';
import { FamilyService } from '../shared/family.service';

@Component({
	selector: 'app-creator',
	templateUrl: './creator.component.html',
	styleUrls: ['./creator.component.css']
})
export class CreatorComponent implements OnInit {
	
	family: Family = new Family();
	father: Father = new Father();
	child: Child = new Child();
	
	showF = false;
	showC = false;

		
	constructor(private router: Router, private familyService: FamilyService){ }

	createFamily(): void {
		this.familyService.createFamily(this.family)
		.subscribe(data => {
			alert("Family created succesfully.");
		});
		this.showF=true;
	}
	addFatherToFamily(): void {
		this.father.familyId = this.family.id;
		this.familyService.addFatherToFamily(this.father,this.family.id)
		.subscribe(data => {
			alert("Father added succesfully.");
		});
		this.showC=true;
	}
	addChildToFamily(): void {
		this.child.familyId = this.family.id;
		this.familyService.addChildToFamily(this.child,this.family.id)
		.subscribe(data => {
			alert("Child added succesfully.");
		});
	}
	
	ngOnInit() {
	}

}
