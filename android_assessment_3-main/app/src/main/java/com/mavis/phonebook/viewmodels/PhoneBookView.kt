package com.mavis.phonebook.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mavis.phonebook.models.Contact
import com.mavis.phonebook.models.PhoneDataBase

class PhoneBookView:ViewModel() {
    var phonebookLiveData = MutableLiveData<List<Contact>>()

    fun getContact(database: PhoneDataBase){
        phonebookLiveData.postValue(database.contactDoa().getAllContacts())
    }

    fun addContact(database: PhoneDataBase, contact: Contact){
        database.contactDoa().addContact(contact)
        getContact(database)
    }
}