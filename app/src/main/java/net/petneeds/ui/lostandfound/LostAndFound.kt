package net.petneeds.ui.lostandfound


import com.google.gson.annotations.SerializedName

data class LostAndFound(
    @SerializedName("ApproximateAge")
    var approximateAge: String?=null,
    @SerializedName("Breed")
    var breed: String?=null,
    @SerializedName("Color")
    var color: String?=null,
    @SerializedName("DateMissingOrFound")
    var dateMissingOrFound: String?=null,
    @SerializedName("Email")
    var email: String?=null,
    @SerializedName("Gender")
    var gender: String?=null,
    @SerializedName("IdentificationMarks")
    var identificationMarks: String?=null,
    @SerializedName("Location")
    var location: String?=null,
    @SerializedName("LostOrFound")
    var lostOrFound: String?=null,
    @SerializedName("OtherInformation")
    var otherInformation: String?=null,
    @SerializedName("PetWearingCollar")
    var petWearingCollar: String?=null,
    @SerializedName("Phone")
    var phone: String?=null,
    @SerializedName("pid")
    var pid: Int?=null,
    @SerializedName("Size")
    var size: String?=null,
    @SerializedName("State")
    var state: String?=null
)