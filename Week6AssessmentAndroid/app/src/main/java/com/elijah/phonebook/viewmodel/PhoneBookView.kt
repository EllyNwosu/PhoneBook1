package com.elijah.phonebook.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elijah.phonebook.models.Contact
import com.elijah.phonebook.models.PhoneDataBase

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