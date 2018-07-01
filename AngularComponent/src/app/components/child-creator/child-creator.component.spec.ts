import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildCreatorComponent } from './child-creator.component';

describe('ChildCreatorComponent', () => {
  let component: ChildCreatorComponent;
  let fixture: ComponentFixture<ChildCreatorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildCreatorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildCreatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
