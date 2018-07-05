import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FamDataComponent } from './fam-data.component';

describe('FamDataComponent', () => {
  let component: FamDataComponent;
  let fixture: ComponentFixture<FamDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FamDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FamDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
