import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 'faa85097-25f7-42bd-8f13-a6d4412c47fa',
  login: '.K',
};

export const sampleWithPartialData: IUser = {
  id: 'edbad510-bef7-4d46-bb5b-3649d8a94696',
  login: '4|@L6YA\\8jpNH',
};

export const sampleWithFullData: IUser = {
  id: '9866903a-7323-4d36-81a8-ee7248e48120',
  login: 'h5TjL-',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
