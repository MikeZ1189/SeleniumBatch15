package reviewClass5;

public class CustomCssSelector {
    //=============================== ID ===================================
    // https://naveenautomationlabs.com/opencart/index.php?route=account/register
    //1. Id in css --> #id
    // #input-firstname
    //2. tagName#id
    // input#input-firstname

    //=============================== CLASS ===================================
    // 1. Class in CSS --> .classValue
    // .form-control
    // 2. tagName.classValue

    //=============================== MULTIPLE CLASSES ===================================
    //https://app.hubspot.com/login
    //1. c1.c2.c3........cn
    //.form-control.private-form__control.login-email
    // tagName.c1.c2.c3.....cn
    // input.form-control.private-form__control.login-email

    // .c1.c2.c3....cn --> .c1.c3.c4
    // .form-control.private-form__control
    // input.login-email

    // c2.c4.c1
    // .login-email.form-control.private-form__control

    //=============================== CLASS AND ID ===================================
    //We can combine id and class together
    //#id.class
    //#username.form-control.private-form__control.login-email
    //#username.login-email
    //tagName#id.class
    //input#username.login-email

    //.class#id
    //.login-email#username
    //tagName.class#id
    //input.login-email#username

    // Identify webElement using CSS without class or id [by using other available attributes]
    // tagName[attribute='value']
    //input[type='email']

    // multiple attributes
    // tagName[attribute1='value1'][attribute2='value2'][attribute3='value3']......[attributeN='valueN']
    //input[name='firstname'][type='text'][id='input-firstname']

    //can we use id or class with other attributes
    //#id[attribute='value']
        //#input-firstname[name='firstname']
    //.class[attribute='value']
        // .form-control[name='firstname']
    //tagName#id[attribute='value']
        //input#input-firstname[name='firstname']
    //tagName.class[attribute='value']
        //input.form-control[name='firstname']

    //can we use text in CSS to create CSS locator?  --> NO we can't

    //Contains in CSS
    // tagName[attribute*='attributeValue']
    // input[name*='firstname']
    // input[name*='name']
    // input[name*='first']

    //tagName[starts-with(@attribute]
    //starts with in CSS
    //tagName[attribute^= ‘starting attribute value’]
    // input[name^='f']

    //ends with
    // tagName[attribute$= ‘starting attribute value’]
    //input[name$='me']

    //parent to child in CSS
    //parentTagName childTagName
    //div input

    // https://www.orangehrm.com/orangehrm-30-day-trialhttps://www.orangehrm.com/orangehrm-30-day-trial
    //div[class='private-form__input-wrapper']input[type='email']
    //select#Form_getForm_Country option


}
