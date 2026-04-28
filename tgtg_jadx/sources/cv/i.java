package cv;

import androidx.recyclerview.widget.m0;
import com.app.tgtg.model.local.AppConstants;
import com.appsflyer.AFInAppEventType;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    private boolean amplitude;
    private boolean appsflyer;
    private boolean braze;

    @NotNull
    private String eventName;
    private boolean facebook;
    private boolean firebase;
    private boolean marketing;
    public static final i CORE_LANDING_PRESENTED = new i("CORE_LANDING_PRESENTED", 0, "Core_Landing_Presented", false, 118);
    public static final i CORE_SIGNUP_COMPLETED = new i("CORE_SIGNUP_COMPLETED", 1, "Core_Signup_Completed", true, 116);
    public static final i CORE_LOGGED_IN = new i("CORE_LOGGED_IN", 2, "Core_Logged_In", false, 118);
    public static final i CORE_APP_READY = new i("CORE_APP_READY", 3, "App_Ready", true, 112);
    public static final i CORE_AVAILABLE_PRODUCT_PRESENTED = new i("CORE_AVAILABLE_PRODUCT_PRESENTED", 4, "Core_Available_Product_Presented", true, 116);
    public static final i CORE_UNAVAILABLE_PRODUCT_PRESENTED = new i("CORE_UNAVAILABLE_PRODUCT_PRESENTED", 5, "Core_Unavailable_Product_Presented", false, 114);
    public static final i CORE_PURCHASE_STARTED = new i("CORE_PURCHASE_STARTED", 6, "Core_Purchase_Started", false, 118);
    public static final i CORE_PURCHASE_ERROR = new i("CORE_PURCHASE_ERROR", 7, "Core_Purchase_Error", false, 126);
    public static final i CORE_PURCHASE_COMPLETED = new i("CORE_PURCHASE_COMPLETED", 8, "Core_Purchase_Completed", false, 126);
    public static final i CORE_PURCHASE_CANCELLED = new i("CORE_PURCHASE_CANCELLED", 9, "Core_Purchase_Cancelled", true, 112);
    public static final i FIREBASE_PURCHASE = new i("FIREBASE_PURCHASE", 10, "purchase", false, 90);
    public static final i APPSFLYER_CORE_PURCHASE_COMPLETED = new i("APPSFLYER_CORE_PURCHASE_COMPLETED", 11, AFInAppEventType.PURCHASE, false, 106);
    public static final i APPSFLYER_CORE_CHURNED_PURCHASE = new i("APPSFLYER_CORE_CHURNED_PURCHASE", 12, "churned_purchase", false, 106);
    public static final i APPSFLYER_CORE_LAPSED_PURCHASE = new i("APPSFLYER_CORE_LAPSED_PURCHASE", 13, "lapsed_purchase", false, 106);
    public static final i FIREBASE_CORE_PURCHASE_COMPLETED = new i("FIREBASE_CORE_PURCHASE_COMPLETED", 14, "Core_Purchase_Completed", false, 90);
    public static final i CORE_PURCHASE_RATED = new i("CORE_PURCHASE_RATED", 15, "Core_Purchase_Rated", false, 116);
    public static final i CORE_PICKUP_COMPLETED = new i("CORE_PICKUP_COMPLETED", 16, "Core_Pickup_Completed", false, 114);
    public static final i CORE_PUSH_OPTIN = new i("CORE_PUSH_OPTIN", 17, "Core_Push_Optin", false, 118);
    public static final i CORE_NOTIFICATIONS_SAVED = new i("CORE_NOTIFICATIONS_SAVED", 18, "Core_Notifications_Saved", false, 118);
    public static final i BRAZE_CORE_PURCHASE_STARTED = new i("BRAZE_CORE_PURCHASE_STARTED", 19, "Core_Purchase_Started", true, 120);
    public static final i BRAZE_CORE_PURCHASE_COMPLETED = new i("BRAZE_CORE_PURCHASE_COMPLETED", 20, "Core_Purchase_Completed", true, 120);
    public static final i BRAZE_CORE_DELEGATION_COLLECTOR_PURCHASE_REDEEMED = new i("BRAZE_CORE_DELEGATION_COLLECTOR_PURCHASE_REDEEMED", 21, "Core_Delegation_Collector_Purchase_Redeemed", true, 120);
    public static final i BRAZE_CORE_PURCHASE_RATED = new i("BRAZE_CORE_PURCHASE_RATED", 22, "Core_Purchase_Rated", true, 120);
    public static final i BASKET_STATE = new i("BASKET_STATE", 23, "Basket_State", true, 120);
    public static final i BRAZE_STORE_USER = new i("BRAZE_STORE_USER", 24, "Store_User", true, 120);
    public static final i BRAZE_ACTION_DELEGATION_COLLECTOR_ACCEPTED = new i("BRAZE_ACTION_DELEGATION_COLLECTOR_ACCEPTED", 25, "Action_Delegation_Collector_Accepted", true, 120);
    public static final i BRAZE_ACTION_DELEGATION_COLLECTOR_RETURNED = new i("BRAZE_ACTION_DELEGATION_COLLECTOR_RETURNED", 26, "Action_Delegation_Collector_Returned", true, 120);
    public static final i BRAZE_ACTION_DELEGATION_OWNER_ACCEPTED = new i("BRAZE_ACTION_DELEGATION_OWNER_ACCEPTED", 27, "Action_Delegation_Owner_Accepted", true, 120);
    public static final i BRAZE_ACTION_DELEGATION_OWNER_RETURNED = new i("BRAZE_ACTION_DELEGATION_OWNER_RETURNED", 28, "Action_Delegation_Owner_Returned", true, 120);
    public static final i BRAZE_ACTION_REFERRAL_PERSONA_CLICK_INVITE_FRIENDS = new i("BRAZE_ACTION_REFERRAL_PERSONA_CLICK_INVITE_FRIENDS", 29, "Action_Referral_PersonA_Click_Invite_Friends", true, 120);
    public static final i BRAZE_ACTION_LOCATION_SET = new i("BRAZE_ACTION_LOCATION_SET", 30, "Action_Location_Set", true, 120);
    public static final i BRAZE_ACTION_CX_TICKET_SUBMITTED = new i("BRAZE_ACTION_CX_TICKET_SUBMITTED", 31, "Action_CX_Ticket_submitted", true, 120);
    public static final i BRAZE_ACTION_PAYMENTMETHOD_ADDED = new i("BRAZE_ACTION_PAYMENTMETHOD_ADDED", 32, "Action_PaymentMethod_added", true, 120);
    public static final i BRAZE_ACTION_DISBAND_PARCEL_CHECKOUT = new i("BRAZE_ACTION_DISBAND_PARCEL_CHECKOUT", 33, "Action_Disband_Parcel_Checkout", true, 120);
    public static final i BRAZE_ACTION_REFERRAL_PERSONA_INVITE_FRIENDS_SCREEN_VISITED = new i("BRAZE_ACTION_REFERRAL_PERSONA_INVITE_FRIENDS_SCREEN_VISITED", 34, "Action_Referral_PersonA_Invite_Friends_Screen_Visited", true, 120);
    public static final i SCREEN_DISCOVER = new i("SCREEN_DISCOVER", 35, "Screen_Discover", false, 126);
    public static final i SCREEN_BASKET_INFO = new i("SCREEN_BASKET_INFO", 36, "Screen_Basket_Info", false, 126);
    public static final i SCREEN_BROWSE = new i("SCREEN_BROWSE", 37, "Screen_Browse", false, 126);
    public static final i SCREEN_LIST = new i("SCREEN_LIST", 38, "Screen_List", false, 126);
    public static final i SCREEN_MAP = new i("SCREEN_MAP", 39, "Screen_Map", false, 126);
    public static final i BRAZE_MAP_SCREEN_SHOWN = new i("BRAZE_MAP_SCREEN_SHOWN", 40, "Map_screen_shown", true, 120);
    public static final i SCREEN_FAVORITES = new i("SCREEN_FAVORITES", 41, "Screen_Favorites", false, 126);
    public static final i SCREEN_FAVORITES_DETAILS = new i("SCREEN_FAVORITES_DETAILS", 42, "Screen_Favorites_Details", false, 126);
    public static final i SCREEN_MENU = new i("SCREEN_MENU", 43, "Screen_Menu", false, 126);
    public static final i SCREEN_MENU_SPECIAL_REWARDS_CARD = new i("SCREEN_MENU_SPECIAL_REWARDS_CARD", 44, "Screen_Menu_Special_Rewards_Card", false, 126);
    public static final i SCREEN_ITEM = new i("SCREEN_ITEM", 45, "Screen_Item", false, 126);
    public static final i SCREEN_CHECKOUT = new i("SCREEN_CHECKOUT", 46, "Screen_Checkout", false, 126);
    public static final i SCREEN_SHIPPING_METHOD = new i("SCREEN_SHIPPING_METHOD", 47, "Screen_Shipping_Method", false, 126);
    public static final i SCREEN_STORE = new i("SCREEN_STORE", 48, "Screen_Store", false, 126);
    public static final i SCREEN_LOCATIONPICKER = new i("SCREEN_LOCATIONPICKER", 49, "Screen_Locationpicker", false, 126);
    public static final i SCREEN_ADD_LOCATION = new i("SCREEN_ADD_LOCATION", 50, "Screen_Add_Location", false, 126);
    public static final i SCREEN_FILTER = new i("SCREEN_FILTER", 51, "Screen_Filter", false, 126);
    public static final i SCREEN_ORDER = new i("SCREEN_ORDER", 52, "Screen_Order", false, 126);
    public static final i SCREEN_COLLECTION_CONFIRMED = new i("SCREEN_COLLECTION_CONFIRMED", 53, "Screen_Collection_Confirmed", false, 126);
    public static final i SCREEN_CONTACT = new i("SCREEN_CONTACT", 54, "Screen_Contact", false, 126);
    public static final i SCREEN_ORDER_CHANGED_ALERT = new i("SCREEN_ORDER_CHANGED_ALERT", 55, "Screen_Order_Changed_Alert", false, 126);
    public static final i SCREEN_THIRDPARTY_TERMS = new i("SCREEN_THIRDPARTY_TERMS", 56, "Screen_Thirdparty_Terms", false, 126);
    public static final i SCREEN_USER_SIGNUP = new i("SCREEN_USER_SIGNUP", 57, "Screen_User_Signup", false, 126);
    public static final i SCREEN_LOGIN_CODE_ATTEMPT_ERROR = new i("SCREEN_LOGIN_CODE_ATTEMPT_ERROR", 58, "Screen_Login_Code_Attempt_Error", false, 126);
    public static final i SCREEN_LOGIN_EMAIL_ATTEMPT_ERROR = new i("SCREEN_LOGIN_EMAIL_ATTEMPT_ERROR", 59, "Screen_Login_Email_Attempt_Error", false, 126);
    public static final i SCREEN_LANDING_EMAIL = new i("SCREEN_LANDING_EMAIL", 60, "Screen_Landing_Email", false, 126);
    public static final i SCREEN_LOGIN_POLLING = new i("SCREEN_LOGIN_POLLING", 61, "Screen_Login_Polling", false, 126);
    public static final i SCREEN_DISCOVER_BUCKET = new i("SCREEN_DISCOVER_BUCKET", 62, "Screen_Discover_Bucket", false, 126);
    public static final i SCREEN_DELIVERY_INFO = new i("SCREEN_DELIVERY_INFO", 63, "Screen_Delivery_Info", false, 126);
    public static final i SCREEN_NEW_PARCEL_POPUP = new i("SCREEN_NEW_PARCEL_POPUP", 64, "Screen_New_Parcel_Popup", false, 126);
    public static final i SCREEN_PAYMENT_ERROR = new i("SCREEN_PAYMENT_ERROR", 65, "Screen_Payment_Error", false, 126);
    public static final i SCREEN_PUDO_LIST = new i("SCREEN_PUDO_LIST", 66, "Screen_PUDO_List", false, 126);
    public static final i SCREEN_STORE_SIGNUP = new i("SCREEN_STORE_SIGNUP", 67, "Screen_Store_Signup", false, 126);
    public static final i SCREEN_ORDER_LIST = new i("SCREEN_ORDER_LIST", 68, "Screen_Order_List", false, 126);
    public static final i SCREEN_PAYMENT_OPTIONS_LIST_PRESENTED = new i("SCREEN_PAYMENT_OPTIONS_LIST_PRESENTED", 69, "Screen_Payment_Options_List_Presented", false, 126);
    public static final i SCREEN_ONBOARDING = new i("SCREEN_ONBOARDING", 70, "Screen_Onboarding", false, 126);
    public static final i SCREEN_MONEY_SAVED = new i("SCREEN_MONEY_SAVED", 71, "Screen_Money_Saved", false, 126);
    public static final i SCREEN_CO2_SAVED = new i("SCREEN_CO2_SAVED", 72, "Screen_CO2_Saved", false, 126);
    public static final i SCREEN_DELIVERY = new i("SCREEN_DELIVERY", 73, "Screen_Delivery", true, 124);
    public static final i SCREEN_CHECKOUT_ADDRESS = new i("SCREEN_CHECKOUT_ADDRESS", 74, "Screen_Checkout_Address", false, 126);
    public static final i SCREEN_CHECKOUT_ADDRESS_ERRORS = new i("SCREEN_CHECKOUT_ADDRESS_ERRORS", 75, "Screen_Checkout_Address_Errors", false, 126);
    public static final i SCREEN_NEED_TO_KNOW = new i("SCREEN_NEED_TO_KNOW", 76, "Screen_Need_To_Know", false, 126);
    public static final i SCREEN_CONTACT_VERIFY_EMAIL = new i("SCREEN_CONTACT_VERIFY_EMAIL", 77, "Screen_Contact_Verify_Email", false, 126);
    public static final i SCREEN_INPUT_VALIDATION_WARNING = new i("SCREEN_INPUT_VALIDATION_WARNING", 78, "Screen_Input_Validation_Warning", false, 126);
    public static final i SCREEN_RECOMMENDATION = new i("SCREEN_RECOMMENDATION", 79, "Screen_Recommendation", false, 126);
    public static final i SCREEN_NPS_SURVEY = new i("SCREEN_NPS_SURVEY", 80, "Screen_NPS_Survey", false, 126);
    public static final i SCREEN_RATE_ORDER = new i("SCREEN_RATE_ORDER", 81, "Screen_Rate_Order", false, 126);
    public static final i SCREEN_INVITE_FRIENDS = new i("SCREEN_INVITE_FRIENDS", 82, "Screen_Invite_Friends", false, 126);
    public static final i SCREEN_BADGE = new i("SCREEN_BADGE", 83, "Screen_Badge", false, 126);
    public static final i SCREEN_HOME = new i("SCREEN_HOME", 84, "Screen_Home", false, 126);
    public static final i SCREEN_HISTORY_LIST = new i("SCREEN_HISTORY_LIST", 85, "Screen_History_List", false, 126);
    public static final i SCREEN_ACCOUNT = new i("SCREEN_ACCOUNT", 86, "Screen_Account", false, 126);
    public static final i SCREEN_INVENTORY = new i("SCREEN_INVENTORY", 87, "Screen_Inventory", false, 126);
    public static final i SCREEN_SPECIAL_REWARDS_MAIN = new i("SCREEN_SPECIAL_REWARDS_MAIN", 88, "Screen_Special_Rewards_Main", false, 126);
    public static final i SCREEN_SPECIAL_REWARD = new i("SCREEN_SPECIAL_REWARD", 89, "Screen_Special_Reward", false, 126);
    public static final i SCREEN_NOTIFICATION_SETTINGS = new i("SCREEN_NOTIFICATION_SETTINGS", 90, "Screen_Notification_Settings", false, 126);
    public static final i SCREEN_BBM_SURVEY = new i("SCREEN_BBM_SURVEY", 91, "Screen_BBM_Survey", false, 126);
    public static final i SCREEN_REWARDS_REDEEMED_SURVEY = new i("SCREEN_REWARDS_REDEEMED_SURVEY", 92, "Screen_Rewards_Redeemed_Survey", false, 126);
    public static final i SCREEN_REWARDS_NOT_REDEEMED_SURVEY = new i("SCREEN_REWARDS_NOT_REDEEMED_SURVEY", 93, "Screen_Rewards_Not_Redeemed_Survey", false, 126);
    public static final i SCREEN_CANCELLATION_INFO = new i("SCREEN_CANCELLATION_INFO", 94, "Screen_Cancellation_Info", false, 126);
    public static final i SCREEN_MYSTORE_WEBVIEW = new i("SCREEN_MYSTORE_WEBVIEW", 95, "Screen_MyStore_Webview", false, 126);
    public static final i TEMP_ACTION_SEE_ELEMENT = new i("TEMP_ACTION_SEE_ELEMENT", 96, "Temp_Action_See_Element", false, 126);
    public static final i TEMP_SCREEN_ACCT_DETAILS = new i("TEMP_SCREEN_ACCT_DETAILS", 97, "Temp_Screen_Acct_Details", false, 126);
    public static final i TEMP_SCREEN_ACCT_DETAILS_FIELD = new i("TEMP_SCREEN_ACCT_DETAILS_FIELD", 98, "Temp_Screen_Acct_Details_Field", false, 126);
    public static final i TEMP_SCREEN_ACCT_DETAILS_FIELD_SAVED = new i("TEMP_SCREEN_ACCT_DETAILS_FIELD_SAVED", 99, "Temp_Screen_Acct_Details_Field_Saved", false, 126);
    public static final i TEMP_FACE_SWAP = new i("TEMP_FACE_SWAP", 100, "Temp_Face_Swap", false, 126);
    public static final i SCREEN_PLANNED_DONATIONS = new i("SCREEN_PLANNED_DONATIONS", 101, "Screen_Planned_Donations", false, 126);
    public static final i SCREEN_DONATION_PLAN = new i("SCREEN_DONATION_PLAN", 102, "Screen_Donation_Plan", false, 126);
    public static final i SCREEN_PLANNED_COLLECTION_DAYS = new i("SCREEN_PLANNED_COLLECTION_DAYS", 103, "Screen_Planned_Collection_Days", false, 126);
    public static final i SCREEN_MANAGE_CUSTOM_COLLECTION_DAYS_CONFLICTS = new i("SCREEN_MANAGE_CUSTOM_COLLECTION_DAYS_CONFLICTS", 104, "Screen_Manage_Custom_Collection_Days_Conflicts", false, 126);
    public static final i SCREEN_LOYALTY_CARD_IN_PROFILE = new i("SCREEN_LOYALTY_CARD_IN_PROFILE", 105, "Screen_Loyalty_Card_In_Profile", false, 126);
    public static final i SCREEN_LOYALTY_CARD_PAGE = new i("SCREEN_LOYALTY_CARD_PAGE", 106, "Screen_Loyalty_Card_Page", false, 126);
    public static final i SCREEN_PUSH_OPTIN = new i("SCREEN_PUSH_OPTIN", 107, "Screen_Push_Optin", false, 126);
    public static final i SCREEN_EMAIL_OPTIN = new i("SCREEN_EMAIL_OPTIN", 108, "Screen_Email_Optin", false, 126);
    public static final i SCREEN_CELEBRATION = new i("SCREEN_CELEBRATION", 109, "Screen_Celebration", false, 126);
    public static final i NOTIFICATION_RECEIVED = new i("NOTIFICATION_RECEIVED", 110, "Notification_Received", false, 126);
    public static final i NOTIFICATION_OPENED = new i("NOTIFICATION_OPENED", 111, "Notification_Opened", false, 126);
    public static final i DEEPLINK_OPENED = new i("DEEPLINK_OPENED", 112, "Deeplink_Opened", false, 126);
    public static final i OTHER_PURCHASE_COLLECTED = new i("OTHER_PURCHASE_COLLECTED", 113, "Other_Purchase_Collected", false, 126);
    public static final i OTHER_PURCHASE_CANCELLED = new i("OTHER_PURCHASE_CANCELLED", 114, "Other_Purchase_Cancelled", false, 126);
    public static final i SCREEN_HELPCENTER = new i("SCREEN_HELPCENTER", 115, "Screen_HelpCenter", false, 126);
    public static final i SCREEN_HELPCENTER_CATEGORY = new i("SCREEN_HELPCENTER_CATEGORY", 116, "Screen_HelpCenter_Category", false, 126);
    public static final i SCREEN_HELPCENTER_TOPIC = new i("SCREEN_HELPCENTER_TOPIC", 117, "Screen_HelpCenter_Topic", false, 126);
    public static final i OTHER_HELPCENTER_ACTION_CLICKED = new i("OTHER_HELPCENTER_ACTION_CLICKED", 118, "Other_HelpCenter_Action_Clicked", false, 126);
    public static final i OTHER_HELPCENTER_CONTACT_CLICKED = new i("OTHER_HELPCENTER_CONTACT_CLICKED", 119, "Other_HelpCenter_Contact_Clicked", false, 126);
    public static final i SCREEN_INVITATION_ACCEPTED = new i("SCREEN_INVITATION_ACCEPTED", 120, "Screen_Invitation_Accepted", false, 126);
    public static final i SCREEN_BAG_COLLECTED_BY_FRIEND = new i("SCREEN_BAG_COLLECTED_BY_FRIEND", 121, "Screen_Bag_Collected_By_Friend", false, 126);
    public static final i SCREEN_ERROR_DEACTIVATE_INVITATION = new i("SCREEN_ERROR_DEACTIVATE_INVITATION", 122, "Screen_Error_Deactivate_Invitation", false, 126);
    public static final i SCREEN_COLLECTION_RETURNED = new i("SCREEN_COLLECTION_RETURNED", AppConstants.RESULT_CODE_ORDER_CANCELLED, "Screen_Collection_Returned", false, 126);
    public static final i SCREEN_ERROR_INVITATION_RECEIVED = new i("SCREEN_ERROR_INVITATION_RECEIVED", 124, "Screen_Error_Invitation_Received", false, 126);
    public static final i SCREEN_COLLECTION_INVITATION_RECEIVED = new i("SCREEN_COLLECTION_INVITATION_RECEIVED", 125, "Screen_Collection_Invitation_Received", false, 126);
    public static final i SCREEN_ERROR_CANCELLATION_DELEGATED = new i("SCREEN_ERROR_CANCELLATION_DELEGATED", 126, "Screen_Error_Cancellation_Delegated", false, 126);
    public static final i SCREEN_POSTAL_CODE_VALIDATION = new i("SCREEN_POSTAL_CODE_VALIDATION", 127, "Screen_Postal_Code_Validation", false, 126);
    public static final i SCREEN_DELIVERY_NOT_AVAILABLE_POPUP = new i("SCREEN_DELIVERY_NOT_AVAILABLE_POPUP", 128, "Screen_Delivery_Not_Available_Popup", false, 126);
    public static final i ACTION_ADD_TO_FAVORITES = new i("ACTION_ADD_TO_FAVORITES", 129, "Action_Add_To_Favorites", true, 116);
    public static final i ACTION_AUTO_SCROLL = new i("ACTION_AUTO_SCROLL", AppConstants.RESULT_CODE_ORDER_COLLECTED, "Action_Auto_Scroll", false, 126);
    public static final i ACTION_CALL_BASKET = new i("ACTION_CALL_BASKET", AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, "Action_Call_Basket", false, 126);
    public static final i ACTION_CANCEL_THIRDPARTY_PAYMENT = new i("ACTION_CANCEL_THIRDPARTY_PAYMENT", AppConstants.RESULT_CODE_FLASH_SALES_SURVEY, "Action_Cancel_Thirdparty_Payment", false, 126);
    public static final i ACTION_CHECKOUT_RESERVE = new i("ACTION_CHECKOUT_RESERVE", 133, "Action_Checkout_Reserve", false, 126);
    public static final i ACTION_CONTACT_COMPLETED = new i("ACTION_CONTACT_COMPLETED", 134, "Action_Contact_Completed", false, 126);
    public static final i ACTION_CONTINUE_ADDRESS_SEARCH = new i("ACTION_CONTINUE_ADDRESS_SEARCH", 135, "Action_Continue_Address_Search", false, 126);
    public static final i ACTION_DOT_CLICKED = new i("ACTION_DOT_CLICKED", 136, "Action_Dot_Clicked", false, 126);
    public static final i ACTION_EMAIL_POST_PURCHASE_ACCEPTED = new i("ACTION_EMAIL_POST_PURCHASE_ACCEPTED", 137, "Action_Email_Post_Purchase_Accepted", false, 126);
    public static final i ACTION_GOTO_NOTIFICATIONS = new i("ACTION_GOTO_NOTIFICATIONS", 138, "Action_Goto_Notifications", true, 124);
    public static final i ACTION_HEED_INPUT_WARNING = new i("ACTION_HEED_INPUT_WARNING", 139, "Action_Heed_Input_Warning", false, 126);
    public static final i ACTION_IGNORE_INPUT_WARNING = new i("ACTION_IGNORE_INPUT_WARNING", 140, "Action_Ignore_Input_Warning", false, 126);
    public static final i ACTION_INITIATE_ADDRESS_SEARCH = new i("ACTION_INITIATE_ADDRESS_SEARCH", 141, "Action_Initiate_Address_Search", false, 126);
    public static final i ACTION_INITIATE_CANCELLATION = new i("ACTION_INITIATE_CANCELLATION", 142, "Action_Initiate_Cancellation", false, 126);
    public static final i ACTION_INSTALL_APP_C2C = new i("ACTION_INSTALL_APP_C2C", 143, "Action_Install_App_C2C", false, 126);
    public static final i ACTION_INVITE_FRIENDS = new i("ACTION_INVITE_FRIENDS", 144, "Action_Invite_Friends", false, 126);
    public static final i ACTION_ITEM_DESCRIPTION_UNFOLD = new i("ACTION_ITEM_DESCRIPTION_UNFOLD", 145, "Action_Item_Description_Unfold", false, 126);
    public static final i ACTION_LOCATION_PICKED = new i("ACTION_LOCATION_PICKED", 146, "Action_Location_Picked", false, 126);
    public static final i ACTION_LOG_OUT = new i("ACTION_LOG_OUT", 147, "Action_Log_Out", false, 126);
    public static final i ACTION_PAYMENT_METHOD_SELECTED_FROM_LIST = new i("ACTION_PAYMENT_METHOD_SELECTED_FROM_LIST", AppConstants.CONTACT_US_REQUEST_FILE, "Action_Payment_Method_Selected_From_List", false, 126);
    public static final i ACTION_PAYMENT_STARTED = new i("ACTION_PAYMENT_STARTED", 149, "Action_Payment_Started", false, 126);
    public static final i ACTION_SEE_ALL_CLICKED = new i("ACTION_SEE_ALL_CLICKED", 150, "Action_See_All_Clicked", false, 126);
    public static final i ACTION_SELECT_OTHER_PAYMENT_METHOD = new i("ACTION_SELECT_OTHER_PAYMENT_METHOD", 151, "Action_Select_Other_Payment_Method", false, 126);
    public static final i ACTION_SELECT_SUGGESTED_ADDRESS = new i("ACTION_SELECT_SUGGESTED_ADDRESS", 152, "Action_Select_Suggested_Address", false, 126);
    public static final i ACTION_SEND_INVITE_V3 = new i("ACTION_SEND_INVITE_V3", 153, "Action_Send_Invite", false, 126);
    public static final i ACTION_SKIP_ONBOARDING = new i("ACTION_SKIP_ONBOARDING", 154, "Action_Skip_Onboarding", false, 126);
    public static final i ACTION_STORE_SUBMIT = new i("ACTION_STORE_SUBMIT", 155, "Action_Store_Submit", false, 126);
    public static final i ACTION_SUBMIT_ADD_VOUCHER = new i("ACTION_SUBMIT_ADD_VOUCHER", 156, "Action_Submit_Add_Voucher", false, 126);
    public static final i ACTION_TRACKING_OPTIN = new i("ACTION_TRACKING_OPTIN", 157, "Action_Tracking_Optin", false, 126);
    public static final i ACTION_FILTER_ENABLED = new i("ACTION_FILTER_ENABLED", 158, "Action_Filter_Enabled", false, 126);
    public static final i ACTION_QUICK_FILTER_APPLIED = new i("ACTION_QUICK_FILTER_APPLIED", 159, "Action_Quick_Filter_Applied", false, 126);
    public static final i ACTION_QUICK_FILTER_RESET = new i("ACTION_QUICK_FILTER_RESET", 160, "Action_Quick_Filter_Reset", false, 126);
    public static final i ACTION_LIST_SORTBY_TAPPED = new i("ACTION_LIST_SORTBY_TAPPED", 161, "Action_List_Sortby_Tapped", false, 126);
    public static final i ACTION_CLOSE_NPS = new i("ACTION_CLOSE_NPS", 162, "Action_Close_NPS", false, 126);
    public static final i ACTION_CLOSE_RATING = new i("ACTION_CLOSE_RATING", 163, "Action_Close_Rating", false, 126);
    public static final i ACTION_C2B_REFERRAL_CARD_CLICKED = new i("ACTION_C2B_REFERRAL_CARD_CLICKED", 164, "Action_C2B_Referral_Card_Clicked", false, 126);
    public static final i ACTION_DISMISS_BASKET_INTRO = new i("ACTION_DISMISS_BASKET_INTRO", 165, "Action_Dismiss_Basket_Intro", false, 126);
    public static final i ACTION_FIND_STORE = new i("ACTION_FIND_STORE", 166, "Action_Find_Store", false, 126);
    public static final i ACTION_TO_BADGES = new i("ACTION_TO_BADGES", 167, "Action_To_Badges", false, 126);
    public static final i ACTION_SEND_INVITATION = new i("ACTION_SEND_INVITATION", 168, "Action_Send_Invitation", false, 126);
    public static final i ACTION_DEACTIVATE_INVITATION = new i("ACTION_DEACTIVATE_INVITATION", 169, "Action_Deactivate_Invitation", false, 126);
    public static final i ACTION_INVITATION_DECLINED = new i("ACTION_INVITATION_DECLINED", 170, "Action_Invitation_Declined", false, 126);
    public static final i ACTION_INVITATION_ACCEPTED = new i("ACTION_INVITATION_ACCEPTED", 171, "Action_Invitation_Accepted", false, 126);
    public static final i ACTION_SEND_INVITATION_BACK = new i("ACTION_SEND_INVITATION_BACK", 172, "Action_Send_Invitation_Back", false, 126);
    public static final i ACTION_LEAVE_DELIVERY = new i("ACTION_LEAVE_DELIVERY", 173, "Action_Leave_Delivery", true, 120);
    public static final i ACTION_DECLINE = new i("ACTION_DECLINE", 174, "Action_Decline", false, 126);
    public static final i ACTION_CANCEL_DONATION = new i("ACTION_CANCEL_DONATION", 175, "Action_Cancel_Donation", false, 126);
    public static final i ACTION_CONFIRM_DECLINE = new i("ACTION_CONFIRM_DECLINE", 176, "Action_Confirm_Decline", false, 126);
    public static final i ACTION_REMIND_ME_BUTTON = new i("ACTION_REMIND_ME_BUTTON", 177, "Action_Remind_Me_Button", false, 126);
    public static final i ACTION_ANSWER_BBM_SURVEY = new i("ACTION_ANSWER_BBM_SURVEY", 178, "Action_Answer_BBM_Survey", false, 126);
    public static final i ACTION_ANSWER_REWARDS_REDEEMED_SURVEY = new i("ACTION_ANSWER_REWARDS_REDEEMED_SURVEY", 179, "Action_Answer_Rewards_Redeemed_Survey", false, 126);
    public static final i ACTION_ANSWER_REWARDS_NOT_REDEEMED_SURVEY = new i("ACTION_ANSWER_REWARDS_NOT_REDEEMED_SURVEY", 180, "Action_Answer_Rewards_Not_Redeemed_Survey", false, 126);
    public static final i ACTION_SKIP_BBM_SURVEY = new i("ACTION_SKIP_BBM_SURVEY", 181, "Action_Skip_BBM_Survey", false, 126);
    public static final i ACTION_SKIP_REWARDS_REDEEMED_SURVEY = new i("ACTION_SKIP_REWARDS_REDEEMED_SURVEY", 182, "Action_Skip_Rewards_Redeemed_Survey", false, 126);
    public static final i ACTION_SKIP_REWARDS_NOT_REDEEMED_SURVEY = new i("ACTION_SKIP_REWARDS_NOT_REDEEMED_SURVEY", 183, "Action_Skip_Rewards_Not_Redeemed_Survey", false, 126);
    public static final i ACTION_GOTO_MANAGE_ACCOUNT = new i("ACTION_GOTO_MANAGE_ACCOUNT", 184, "Action_Goto_Manage_Account", false, 126);
    public static final i ACTION_GOTO_BLOG = new i("ACTION_GOTO_BLOG", ModuleDescriptor.MODULE_VERSION, "Action_Goto_Blog", false, 126);
    public static final i ACTION_BROWSE_OTHER_BAGS = new i("ACTION_BROWSE_OTHER_BAGS", 186, "Action_Browse_Other_Bags", false, 126);
    public static final i ACTION_BROWSE_OTHER_PARCELS = new i("ACTION_BROWSE_OTHER_PARCELS", 187, "Action_Browse_Other_Parcels", false, 126);
    public static final i ACTION_CLICK_RECOMMENDED_ITEM = new i("ACTION_CLICK_RECOMMENDED_ITEM", 188, "Action_Click_Recommended_Item", false, 126);
    public static final i ACTION_UNWRAP_SPECIAL_REWARD = new i("ACTION_UNWRAP_SPECIAL_REWARD", 189, "Action_Unwrap_Special_Reward", false, 126);
    public static final i ACTION_REDEEM_SPECIAL_REWARD = new i("ACTION_REDEEM_SPECIAL_REWARD", 190, "Action_Redeem_Special_Reward", false, 126);
    public static final i ACTION_PLANNED_DONATIONS_TOOLTIP_CLICKED = new i("ACTION_PLANNED_DONATIONS_TOOLTIP_CLICKED", 191, "Action_Planned_Donations_Tooltip_Clicked", false, 126);
    public static final i ACTION_WEEK_PLANNED_DONATIONS_CLICKED = new i("ACTION_WEEK_PLANNED_DONATIONS_CLICKED", BERTags.PRIVATE, "Action_Week_Planned_Donations_Clicked", false, 126);
    public static final i ACTION_MANAGE_CUSTOM_COLLECTION_DAYS = new i("ACTION_MANAGE_CUSTOM_COLLECTION_DAYS", 193, "Action_Manage_Custom_Collection_Days", false, 126);
    public static final i ACTION_CUSTOM_COLLECTION_DAYS_SAVE = new i("ACTION_CUSTOM_COLLECTION_DAYS_SAVE", 194, "Action_Custom_Collection_Days_Save", false, 126);
    public static final i ACTION_CUSTOM_COLLECTION_DAYS_CONFIRM = new i("ACTION_CUSTOM_COLLECTION_DAYS_CONFIRM", 195, "Action_Custom_Collection_Days_Confirm", false, 126);
    public static final i ACTION_MANAGE_CUSTOM_COLLECTION_DAYS_CLOSE = new i("ACTION_MANAGE_CUSTOM_COLLECTION_DAYS_CLOSE", 196, "Action_Manage_Custom_Collection_Days_Close", false, 126);
    public static final i ACTION_CUSTOM_COLLECTION_DAYS_DELETE = new i("ACTION_CUSTOM_COLLECTION_DAYS_DELETE", 197, "Action_Custom_Collection_Days_Delete", false, 126);
    public static final i ACTION_SEARCH_SUBMITTED = new i("ACTION_SEARCH_SUBMITTED", 198, "Action_Search_Submitted", false, 126);
    public static final i ACTION_BROWSE_MAP_BUTTON_CLICKED = new i("ACTION_BROWSE_MAP_BUTTON_CLICKED", 199, "Action_Browse_Map_Button_Clicked", false, 126);
    public static final i ACTION_BROWSE_MAP_LIST_CLICKED = new i("ACTION_BROWSE_MAP_LIST_CLICKED", 200, "Action_Browse_Map_List_Clicked", false, 126);
    public static final i ACTION_ONBOARDING_USP = new i("ACTION_ONBOARDING_USP", AppConstants.PERMISSIONS_REQUEST_USE_LOCATION, "Action_Onboarding_USP", false, 126);
    public static final i ACTION_ONBOARDING_COLLECTION_TIMES = new i("ACTION_ONBOARDING_COLLECTION_TIMES", AppConstants.PERMISSIONS_REQUEST_CALL_PHONE, "Action_Onboarding_Collection_Times", false, 126);
    public static final i ACTION_OPEN_FAVORITE_REMINDER_PAGE = new i("ACTION_OPEN_FAVORITE_REMINDER_PAGE", 203, "Action_Open_Favorite_Reminder_Page", false, 126);
    public static final i ACTION_CLICK_REMINDER = new i("ACTION_CLICK_REMINDER", 204, "Action_Click_Reminder", false, 126);
    public static final i ACTION_SAVE_FAVORITE_REMINDER = new i("ACTION_SAVE_FAVORITE_REMINDER", 205, "Action_Save_Favorite_Reminder", false, 126);
    public static final i ACTION_TURN_OFF_FAVORITE_REMINDER = new i("ACTION_TURN_OFF_FAVORITE_REMINDER", 206, "Action_Turn_Off_Favorite_Reminder", false, 126);
    public static final i ACTION_ITEM_DESCRIPTION_TRANSLATE = new i("ACTION_ITEM_DESCRIPTION_TRANSLATE", 207, "Action_Item_Description_Translate", false, 126);
    public static final i ACTION_OPEN_LOYALTY_CARD_PAGE = new i("ACTION_OPEN_LOYALTY_CARD_PAGE", 208, "Action_Open_Loyalty_Card_Page", false, 126);
    public static final i ACTION_CLOSE_LOYALTY_CARD_PAGE = new i("ACTION_CLOSE_LOYALTY_CARD_PAGE", 209, "Action_Close_Loyalty_Card_Page", false, 126);
    public static final i ACTION_CLOSE_LOYALTY_CARD_INITIAL_SECTION = new i("ACTION_CLOSE_LOYALTY_CARD_INITIAL_SECTION", 210, "Action_Close_Loyalty_Card_Initial_Section", false, 126);
    public static final i ACTION_SEE_LOYALTY_CARD_VOUCHER = new i("ACTION_SEE_LOYALTY_CARD_VOUCHER", Primes.SMALL_FACTOR_LIMIT, "Action_See_Loyalty_Card_Voucher", false, 126);
    public static final i ACTION_CLOSE_LOYALTY_CARD_COMPLETE_SECTION = new i("ACTION_CLOSE_LOYALTY_CARD_COMPLETE_SECTION", 212, "Action_Close_Loyalty_Card_Complete_Section", false, 126);
    public static final i ACTION_LOCATION_ADDED = new i("ACTION_LOCATION_ADDED", 213, "Action_Location_Added", false, 126);
    public static final i ACTION_LOCATION_CHANGED = new i("ACTION_LOCATION_CHANGED", 214, "Action_Location_Changed", false, 126);
    public static final i ACTION_CLICK_INGREDIENT_TAG = new i("ACTION_CLICK_INGREDIENT_TAG", 215, "Action_Click_Ingredient_Tag", false, 126);
    public static final i ACTION_ITEM_PAGE_SCROLL = new i("ACTION_ITEM_PAGE_SCROLL", 216, "Action_Item_Page_Scroll", false, 126);
    public static final i ACTION_CLICK_DIRECTIONS = new i("ACTION_CLICK_DIRECTIONS", 217, "Action_Click_Directions", false, 126);
    public static final i ACTION_OPEN_CHAT_WIDGET = new i("ACTION_OPEN_CHAT_WIDGET", 218, "Action_Open_Chat_Widget", false, 126);
    public static final i ACTION_LOGO_CLICKED = new i("ACTION_LOGO_CLICKED", 219, "Action_Logo_Clicked", false, 126);
    public static final i ACTION_ADDRESS_CLICKED = new i("ACTION_ADDRESS_CLICKED", 220, "Action_Address_Clicked", false, 126);
    public static final i APPSFLYER_ACTION_STORE_SUBMIT = new i("APPSFLYER_ACTION_STORE_SUBMIT", 221, "Action_Store_Submit", false, 112);
    public static final i APPSFLYER_FIRST_PURCHASE = new i("APPSFLYER_FIRST_PURCHASE", AppConstants.GPS_SETTINGS, "SDK_First_Purchase", false, 106);
    public static final i TEMP_BUTTON_ASK_A_FRIEND = new i("TEMP_BUTTON_ASK_A_FRIEND", AppConstants.GO_TO_GPS_SETTINGS, "Temp_Button_Ask_A_Friend", false, 126);
    public static final i TEMP_ACTION_ACCT_DETAILS_FIELD_SAVE = new i("TEMP_ACTION_ACCT_DETAILS_FIELD_SAVE", BERTags.FLAGS, "Temp_Action_Acct_Details_Field_Save", false, 126);
    public static final i TEMP_ACTION_UNFOLD_ITEM_DESCRIPTION = new i("TEMP_ACTION_UNFOLD_ITEM_DESCRIPTION", 225, "Temp_Action_Unfold_Item_Description", false, 126);
    public static final i TEMP_ACTION_TRACK_PARCEL = new i("TEMP_ACTION_TRACK_PARCEL", 226, "Temp_Action_Track_Parcel", false, 126);
    public static final i TEMP_ACTION_SEE_ITEM_FAQ = new i("TEMP_ACTION_SEE_ITEM_FAQ", 227, "Temp_Action_See_Item_FAQ", false, 126);
    public static final i TEMP_ACTION_UNFOLD_ITEM_FAQ = new i("TEMP_ACTION_UNFOLD_ITEM_FAQ", 228, "Temp_Action_Unfold_Item_FAQ", false, 126);
    public static final i TEMP_ACTION_CLICK_FAQ_LINK = new i("TEMP_ACTION_CLICK_FAQ_LINK", 229, "Temp_Action_Click_FAQ_Link", false, 126);
    public static final i TEMP_ACTION_SOLD_OUT = new i("TEMP_ACTION_SOLD_OUT", 230, "Temp_Action_Sold_Out", false, 126);
    public static final i TEMP_ACTION_SEE_CAROUSEL_ELEMENT = new i("TEMP_ACTION_SEE_CAROUSEL_ELEMENT", 231, "Temp_Action_See_Carousel_Element", false, 126);
    public static final i TEMP_LIVE_LOCATION_CLICKED = new i("TEMP_LIVE_LOCATION_CLICKED", 232, "Temp_Live_Location_Clicked", false, 126);
    public static final i TEMP_USE_VOUCHER_TOGGLE = new i("TEMP_USE_VOUCHER_TOGGLE", 233, "Temp_Use_Voucher_Toggle", false, 126);
    public static final i TEMP_ACTION_SHARE_ITEM = new i("TEMP_ACTION_SHARE_ITEM", 234, "Temp_Action_Share_Item", false, 126);
    public static final i TEMP_ACTION_INGREDIENT_CAROUSEL_VIEWS = new i("TEMP_ACTION_INGREDIENT_CAROUSEL_VIEWS", 235, "Temp_Action_Ingredient_Carousel_Views", false, 126);
    public static final i TEMP_SCREEN_POP_UP_CHANGE_PUSH_SETTINGS = new i("TEMP_SCREEN_POP_UP_CHANGE_PUSH_SETTINGS", 236, "Temp_Screen_Pop_Up_Change_Push_Settings", false, 126);
    public static final i TEMP_ACCEPT_POP_UP_CHANGE_PUSH_SETTINGS = new i("TEMP_ACCEPT_POP_UP_CHANGE_PUSH_SETTINGS", 237, "Temp_Accept_Pop_Up_Change_Push_Settings", false, 126);
    public static final i TEMP_REJECT_POP_UP_CHANGE_PUSH_SETTINGS = new i("TEMP_REJECT_POP_UP_CHANGE_PUSH_SETTINGS", 238, "Temp_Reject_Pop_Up_Change_Push_Settings", false, 126);
    public static final i DEBUG_SYSTEM_LOG_OUT = new i("DEBUG_SYSTEM_LOG_OUT", 239, "Debug_System_Log_Out", false, 126);
    public static final i DEBUG_CHECKOUT_FAILED = new i("DEBUG_CHECKOUT_FAILED", 240, "Debug_Checkout_Failed", false, 126);
    public static final i DEBUG_PAYMENT_FAILED = new i("DEBUG_PAYMENT_FAILED", 241, "Debug_Payment_Failed", false, 126);
    public static final i DEBUG_ADYEN_REDIRECT_HANDLE_INTENT = new i("DEBUG_ADYEN_REDIRECT_HANDLE_INTENT", 242, "Debug_Adyen_Redirect_Handle_Intent", false, 126);
    public static final i DEBUG_ADYEN_REDIRECT_SENDING_ADDITIONAL_DETAILS = new i("DEBUG_ADYEN_REDIRECT_SENDING_ADDITIONAL_DETAILS", 243, "Debug_Adyen_Redirect_Sending_Additional_Details", false, 126);
    public static final i DEBUG_ADYEN_REDIRECT_ACTION_TYPE = new i("DEBUG_ADYEN_REDIRECT_ACTION_TYPE", 244, "Debug_Adyen_Redirect_Action_Type", false, 126);
    public static final i DEBUG_ADYEN_BIOMETRICS_FAILED = new i("DEBUG_ADYEN_BIOMETRICS_FAILED", 245, "Debug_Adyen_Biometrics_Failed", false, 126);
    public static final i DEBUG_ADYEN_BIOMETRICS = new i("DEBUG_ADYEN_BIOMETRICS", 246, "Debug_Adyen_Biometrics", false, 126);
    public static final i DEBUG_ADYEN_BIOMETRICS_PAY = new i("DEBUG_ADYEN_BIOMETRICS_PAY", 247, "Debug_Adyen_Biometrics_Pay", false, 126);
    public static final i DEBUG_ADYEN_COMPONENT_POLLING_ERROR = new i("DEBUG_ADYEN_COMPONENT_POLLING_ERROR", 248, "Debug_Adyen_Component_Polling_Error", false, 126);
    public static final i DEBUG_ADYEN_REDIRECT_FAIL = new i("DEBUG_ADYEN_REDIRECT_FAIL", 249, "Debug_Adyen_Redirect_Fail", false, 126);
    public static final i DEBUG_IMAGE_TOO_BIG = new i("DEBUG_IMAGE_TOO_BIG", m0.DEFAULT_SWIPE_ANIMATION_DURATION, "Debug_Image_Too_Big", false, 126);
    public static final i APP_PURCHASE_COMPLETED = new i("APP_PURCHASE_COMPLETED", 251, "app_purchase_completed", false, 58);
    public static final i APP_POTENTIALLY_GOOD_USER_SIGNED_UP = new i("APP_POTENTIALLY_GOOD_USER_SIGNED_UP", 252, "app_potentially_good_user_signed_up", false, 58);
    public static final i MAGIC_PARCEL_PURCHASE = new i("MAGIC_PARCEL_PURCHASE", 253, "Magic_Parcel_Purchase", false, 114);
    public static final i CHARITY_LOGIN_CONTINUE_AS_CHARITY = new i("CHARITY_LOGIN_CONTINUE_AS_CHARITY", 254, "Charity_Login_Continue_As_Charity", false, 126);
    public static final i SCREEN_CHARITY_LOGIN = new i("SCREEN_CHARITY_LOGIN", 255, "Screen_Charity_Login", false, 126);
    public static final i CHARITY_LOGIN_STARTED = new i("CHARITY_LOGIN_STARTED", 256, "Charity_Login_Started", false, 126);
    public static final i CHARITY_LOGIN_BACK = new i("CHARITY_LOGIN_BACK", 257, "Charity_Login_Back", false, 126);
    public static final i CHARITY_LOGIN_LEARN_MORE = new i("CHARITY_LOGIN_LEARN_MORE", 258, "Charity_Login_Learn_More", false, 126);
    public static final i CHARITY_LOGIN_EMAIL_PROVIDED = new i("CHARITY_LOGIN_EMAIL_PROVIDED", 259, "Charity_Login_Email_Provided", false, 126);
    public static final i SCREEN_CHARITY_LOGIN_VERIFY_EMAIL = new i("SCREEN_CHARITY_LOGIN_VERIFY_EMAIL", 260, "Screen_Charity_Login_Verify_Email", false, 126);
    public static final i CHARITY_LOGIN_DIDNT_RECEIVE_EMAIL = new i("CHARITY_LOGIN_DIDNT_RECEIVE_EMAIL", 261, "Charity_Login_Didnt_Receive_Email", false, 126);
    public static final i CHARITY_LOGIN_CHARITY_COUNTRY = new i("CHARITY_LOGIN_CHARITY_COUNTRY", 262, "Charity_Login_Charity_Country", false, 126);
    public static final i CHARITY_LOGIN_CHARITY_USER_TERMS = new i("CHARITY_LOGIN_CHARITY_USER_TERMS", 263, "Charity_Login_Charity_User_Terms", false, 126);
    public static final i CHARITY_LOGIN_PRIVACY_POLICY = new i("CHARITY_LOGIN_PRIVACY_POLICY", 264, "Charity_Login_Privacy_Policy", false, 126);
    public static final i SCREEN_CHARITY_LOGIN_WELCOME = new i("SCREEN_CHARITY_LOGIN_WELCOME", 265, "Screen_Charity_Login_Welcome", false, 126);
    public static final i CHARITY_LOGIN_CONNECT_TO_CHARITY = new i("CHARITY_LOGIN_CONNECT_TO_CHARITY", 266, "Charity_Login_Connect_To_Charity", false, 126);
    public static final i CHARITY_LOGIN_WELCOME_CANCEL = new i("CHARITY_LOGIN_WELCOME_CANCEL", 267, "Charity_Login_Welcome_Cancel", false, 126);
    public static final i SCREEN_CHARITY_LOGIN_CHARITY_ID = new i("SCREEN_CHARITY_LOGIN_CHARITY_ID", 268, "Screen_Charity_Login_Charity_Id", false, 126);
    public static final i CHARITY_LOGIN_INVALID_CHARITY_ID = new i("CHARITY_LOGIN_INVALID_CHARITY_ID", 269, "Charity_Login_Invalid_Charity_Id", false, 126);
    public static final i CHARITY_LOGIN_NO_CHARITY_ID = new i("CHARITY_LOGIN_NO_CHARITY_ID", 270, "Charity_Login_No_Charity_Id", false, 126);
    public static final i SCREEN_CHARITY_LOGIN_CONNECTED_TO_CHARITY = new i("SCREEN_CHARITY_LOGIN_CONNECTED_TO_CHARITY", 271, "Screen_Charity_Login_Connected_To_Charity", false, 126);
    public static final i CHARITY_LOGIN_UPDATED_DONE = new i("CHARITY_LOGIN_UPDATED_DONE", 272, "Charity_Login_Updated_Done", false, 126);
    public static final i CHARITY_LOGIN_CONTACT_US_CLICKED = new i("CHARITY_LOGIN_CONTACT_US_CLICKED", 273, "Charity_Login_Contact_Us_Clicked", false, 126);
    public static final i CHARITY_LOGIN_CONTACT_US_CLOSED = new i("CHARITY_LOGIN_CONTACT_US_CLOSED", 274, "Charity_Login_Contact_Us_Closed", false, 126);
    public static final i CHARITY_LOGIN_CLOSE_WINDOW = new i("CHARITY_LOGIN_CLOSE_WINDOW", 275, "Charity_Login_Close_Window", false, 126);
    public static final i CHARITY_LOGIN_GO_BACK_WINDOW = new i("CHARITY_LOGIN_GO_BACK_WINDOW", 276, "Charity_Login_Go_Back_Window", false, 126);
    public static final i TEMP_OTHER_CLICKED = new i("TEMP_OTHER_CLICKED", 277, "Temp_Other_Clicked", false, 126);
    public static final i CHARITY_LOGIN_ERROR = new i("CHARITY_LOGIN_ERROR", 278, "Charity_Login_Error", false, 126);
    public static final i SCREEN_FRIDGE_INTRO = new i("SCREEN_FRIDGE_INTRO", 279, "Screen_Fridge_Intro", false, 126);
    public static final i ACTION_START_CAMERA = new i("ACTION_START_CAMERA", 280, "Action_Start_Camera", false, 126);
    public static final i SCREEN_RECIPE = new i("SCREEN_RECIPE", 281, "Screen_Recipe", false, 126);
    public static final i SCREEN_SAVED_RECIPE_LIST = new i("SCREEN_SAVED_RECIPE_LIST", 282, "Screen_Saved_Recipe_List", false, 126);
    public static final i ACTION_CLOSE_CAMERA_ACCESS = new i("ACTION_CLOSE_CAMERA_ACCESS", 283, "Action_Close_Camera_Access", false, 126);
    public static final i ACTION_UPLOAD_PHOTO = new i("ACTION_UPLOAD_PHOTO", 284, "Action_Upload_Photo", false, 126);
    public static final i SCREEN_RECIPE_GENERATION = new i("SCREEN_RECIPE_GENERATION", 285, "Screen_Recipe_Generation", false, 126);
    public static final i SCREEN_FRIDGE_WARNING = new i("SCREEN_FRIDGE_WARNING", 286, "Screen_Fridge_Warning", false, 126);
    public static final i SCREEN_FRIDGE_BANNER = new i("SCREEN_FRIDGE_BANNER", 287, "Screen_Fridge_Banner", false, 126);
    public static final i ACTION_DISMISS_FRIDGE_BANNER = new i("ACTION_DISMISS_FRIDGE_BANNER", 288, "Action_Dismiss_Fridge_Banner", false, 126);
    public static final i ACTION_DELETE_PHOTO = new i("ACTION_DELETE_PHOTO", 289, "Action_Delete_Photo", false, 126);
    public static final i SCREEN_RECIPE_LIST = new i("SCREEN_RECIPE_LIST", 290, "Screen_Recipe_List", false, 126);
    public static final i ACTION_TAP_RECIPE_TAB = new i("ACTION_TAP_RECIPE_TAB", 291, "Action_Tap_Recipe_Tab", false, 126);
    public static final i ACTION_CLOSE_RECIPE = new i("ACTION_CLOSE_RECIPE", 292, "Action_Close_Recipe", false, 126);
    public static final i ACTION_SAVE_RECIPE = new i("ACTION_SAVE_RECIPE", 293, "Action_Save_Recipe", false, 126);
    public static final i ACTION_UNSAVE_RECIPE = new i("ACTION_UNSAVE_RECIPE", 294, "Action_Unsave_Recipe", false, 126);
    public static final i SCREEN_RECIPE_PREFERENCES = new i("SCREEN_RECIPE_PREFERENCES", 295, "Screen_Recipe_Preferences", false, 126);
    public static final i SCREEN_RECIPE_HISTORY = new i("SCREEN_RECIPE_HISTORY", 296, "Screen_Recipe_History", false, 126);
    public static final i UI_INTERACTION = new i("UI_INTERACTION", 297, "ui_interaction", false, 126);

    static {
        i[] iVarArrA = a();
        $VALUES = iVarArrA;
        $ENTRIES = n.w(iVarArrA);
    }

    public i(String str, int i11, String str2, boolean z11, int i12) {
        z11 = (i12 & 2) != 0 ? false : z11;
        boolean z12 = (i12 & 4) != 0;
        boolean z13 = (i12 & 8) == 0;
        boolean z14 = (i12 & 16) != 0 ? z13 : true;
        boolean z15 = (i12 & 32) != 0 ? z13 : true;
        boolean z16 = (i12 & 64) == 0;
        this.eventName = str2;
        this.braze = z11;
        this.amplitude = z12;
        this.marketing = z13;
        this.appsflyer = z14;
        this.firebase = z15;
        this.facebook = z16;
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{CORE_LANDING_PRESENTED, CORE_SIGNUP_COMPLETED, CORE_LOGGED_IN, CORE_APP_READY, CORE_AVAILABLE_PRODUCT_PRESENTED, CORE_UNAVAILABLE_PRODUCT_PRESENTED, CORE_PURCHASE_STARTED, CORE_PURCHASE_ERROR, CORE_PURCHASE_COMPLETED, CORE_PURCHASE_CANCELLED, FIREBASE_PURCHASE, APPSFLYER_CORE_PURCHASE_COMPLETED, APPSFLYER_CORE_CHURNED_PURCHASE, APPSFLYER_CORE_LAPSED_PURCHASE, FIREBASE_CORE_PURCHASE_COMPLETED, CORE_PURCHASE_RATED, CORE_PICKUP_COMPLETED, CORE_PUSH_OPTIN, CORE_NOTIFICATIONS_SAVED, BRAZE_CORE_PURCHASE_STARTED, BRAZE_CORE_PURCHASE_COMPLETED, BRAZE_CORE_DELEGATION_COLLECTOR_PURCHASE_REDEEMED, BRAZE_CORE_PURCHASE_RATED, BASKET_STATE, BRAZE_STORE_USER, BRAZE_ACTION_DELEGATION_COLLECTOR_ACCEPTED, BRAZE_ACTION_DELEGATION_COLLECTOR_RETURNED, BRAZE_ACTION_DELEGATION_OWNER_ACCEPTED, BRAZE_ACTION_DELEGATION_OWNER_RETURNED, BRAZE_ACTION_REFERRAL_PERSONA_CLICK_INVITE_FRIENDS, BRAZE_ACTION_LOCATION_SET, BRAZE_ACTION_CX_TICKET_SUBMITTED, BRAZE_ACTION_PAYMENTMETHOD_ADDED, BRAZE_ACTION_DISBAND_PARCEL_CHECKOUT, BRAZE_ACTION_REFERRAL_PERSONA_INVITE_FRIENDS_SCREEN_VISITED, SCREEN_DISCOVER, SCREEN_BASKET_INFO, SCREEN_BROWSE, SCREEN_LIST, SCREEN_MAP, BRAZE_MAP_SCREEN_SHOWN, SCREEN_FAVORITES, SCREEN_FAVORITES_DETAILS, SCREEN_MENU, SCREEN_MENU_SPECIAL_REWARDS_CARD, SCREEN_ITEM, SCREEN_CHECKOUT, SCREEN_SHIPPING_METHOD, SCREEN_STORE, SCREEN_LOCATIONPICKER, SCREEN_ADD_LOCATION, SCREEN_FILTER, SCREEN_ORDER, SCREEN_COLLECTION_CONFIRMED, SCREEN_CONTACT, SCREEN_ORDER_CHANGED_ALERT, SCREEN_THIRDPARTY_TERMS, SCREEN_USER_SIGNUP, SCREEN_LOGIN_CODE_ATTEMPT_ERROR, SCREEN_LOGIN_EMAIL_ATTEMPT_ERROR, SCREEN_LANDING_EMAIL, SCREEN_LOGIN_POLLING, SCREEN_DISCOVER_BUCKET, SCREEN_DELIVERY_INFO, SCREEN_NEW_PARCEL_POPUP, SCREEN_PAYMENT_ERROR, SCREEN_PUDO_LIST, SCREEN_STORE_SIGNUP, SCREEN_ORDER_LIST, SCREEN_PAYMENT_OPTIONS_LIST_PRESENTED, SCREEN_ONBOARDING, SCREEN_MONEY_SAVED, SCREEN_CO2_SAVED, SCREEN_DELIVERY, SCREEN_CHECKOUT_ADDRESS, SCREEN_CHECKOUT_ADDRESS_ERRORS, SCREEN_NEED_TO_KNOW, SCREEN_CONTACT_VERIFY_EMAIL, SCREEN_INPUT_VALIDATION_WARNING, SCREEN_RECOMMENDATION, SCREEN_NPS_SURVEY, SCREEN_RATE_ORDER, SCREEN_INVITE_FRIENDS, SCREEN_BADGE, SCREEN_HOME, SCREEN_HISTORY_LIST, SCREEN_ACCOUNT, SCREEN_INVENTORY, SCREEN_SPECIAL_REWARDS_MAIN, SCREEN_SPECIAL_REWARD, SCREEN_NOTIFICATION_SETTINGS, SCREEN_BBM_SURVEY, SCREEN_REWARDS_REDEEMED_SURVEY, SCREEN_REWARDS_NOT_REDEEMED_SURVEY, SCREEN_CANCELLATION_INFO, SCREEN_MYSTORE_WEBVIEW, TEMP_ACTION_SEE_ELEMENT, TEMP_SCREEN_ACCT_DETAILS, TEMP_SCREEN_ACCT_DETAILS_FIELD, TEMP_SCREEN_ACCT_DETAILS_FIELD_SAVED, TEMP_FACE_SWAP, SCREEN_PLANNED_DONATIONS, SCREEN_DONATION_PLAN, SCREEN_PLANNED_COLLECTION_DAYS, SCREEN_MANAGE_CUSTOM_COLLECTION_DAYS_CONFLICTS, SCREEN_LOYALTY_CARD_IN_PROFILE, SCREEN_LOYALTY_CARD_PAGE, SCREEN_PUSH_OPTIN, SCREEN_EMAIL_OPTIN, SCREEN_CELEBRATION, NOTIFICATION_RECEIVED, NOTIFICATION_OPENED, DEEPLINK_OPENED, OTHER_PURCHASE_COLLECTED, OTHER_PURCHASE_CANCELLED, SCREEN_HELPCENTER, SCREEN_HELPCENTER_CATEGORY, SCREEN_HELPCENTER_TOPIC, OTHER_HELPCENTER_ACTION_CLICKED, OTHER_HELPCENTER_CONTACT_CLICKED, SCREEN_INVITATION_ACCEPTED, SCREEN_BAG_COLLECTED_BY_FRIEND, SCREEN_ERROR_DEACTIVATE_INVITATION, SCREEN_COLLECTION_RETURNED, SCREEN_ERROR_INVITATION_RECEIVED, SCREEN_COLLECTION_INVITATION_RECEIVED, SCREEN_ERROR_CANCELLATION_DELEGATED, SCREEN_POSTAL_CODE_VALIDATION, SCREEN_DELIVERY_NOT_AVAILABLE_POPUP, ACTION_ADD_TO_FAVORITES, ACTION_AUTO_SCROLL, ACTION_CALL_BASKET, ACTION_CANCEL_THIRDPARTY_PAYMENT, ACTION_CHECKOUT_RESERVE, ACTION_CONTACT_COMPLETED, ACTION_CONTINUE_ADDRESS_SEARCH, ACTION_DOT_CLICKED, ACTION_EMAIL_POST_PURCHASE_ACCEPTED, ACTION_GOTO_NOTIFICATIONS, ACTION_HEED_INPUT_WARNING, ACTION_IGNORE_INPUT_WARNING, ACTION_INITIATE_ADDRESS_SEARCH, ACTION_INITIATE_CANCELLATION, ACTION_INSTALL_APP_C2C, ACTION_INVITE_FRIENDS, ACTION_ITEM_DESCRIPTION_UNFOLD, ACTION_LOCATION_PICKED, ACTION_LOG_OUT, ACTION_PAYMENT_METHOD_SELECTED_FROM_LIST, ACTION_PAYMENT_STARTED, ACTION_SEE_ALL_CLICKED, ACTION_SELECT_OTHER_PAYMENT_METHOD, ACTION_SELECT_SUGGESTED_ADDRESS, ACTION_SEND_INVITE_V3, ACTION_SKIP_ONBOARDING, ACTION_STORE_SUBMIT, ACTION_SUBMIT_ADD_VOUCHER, ACTION_TRACKING_OPTIN, ACTION_FILTER_ENABLED, ACTION_QUICK_FILTER_APPLIED, ACTION_QUICK_FILTER_RESET, ACTION_LIST_SORTBY_TAPPED, ACTION_CLOSE_NPS, ACTION_CLOSE_RATING, ACTION_C2B_REFERRAL_CARD_CLICKED, ACTION_DISMISS_BASKET_INTRO, ACTION_FIND_STORE, ACTION_TO_BADGES, ACTION_SEND_INVITATION, ACTION_DEACTIVATE_INVITATION, ACTION_INVITATION_DECLINED, ACTION_INVITATION_ACCEPTED, ACTION_SEND_INVITATION_BACK, ACTION_LEAVE_DELIVERY, ACTION_DECLINE, ACTION_CANCEL_DONATION, ACTION_CONFIRM_DECLINE, ACTION_REMIND_ME_BUTTON, ACTION_ANSWER_BBM_SURVEY, ACTION_ANSWER_REWARDS_REDEEMED_SURVEY, ACTION_ANSWER_REWARDS_NOT_REDEEMED_SURVEY, ACTION_SKIP_BBM_SURVEY, ACTION_SKIP_REWARDS_REDEEMED_SURVEY, ACTION_SKIP_REWARDS_NOT_REDEEMED_SURVEY, ACTION_GOTO_MANAGE_ACCOUNT, ACTION_GOTO_BLOG, ACTION_BROWSE_OTHER_BAGS, ACTION_BROWSE_OTHER_PARCELS, ACTION_CLICK_RECOMMENDED_ITEM, ACTION_UNWRAP_SPECIAL_REWARD, ACTION_REDEEM_SPECIAL_REWARD, ACTION_PLANNED_DONATIONS_TOOLTIP_CLICKED, ACTION_WEEK_PLANNED_DONATIONS_CLICKED, ACTION_MANAGE_CUSTOM_COLLECTION_DAYS, ACTION_CUSTOM_COLLECTION_DAYS_SAVE, ACTION_CUSTOM_COLLECTION_DAYS_CONFIRM, ACTION_MANAGE_CUSTOM_COLLECTION_DAYS_CLOSE, ACTION_CUSTOM_COLLECTION_DAYS_DELETE, ACTION_SEARCH_SUBMITTED, ACTION_BROWSE_MAP_BUTTON_CLICKED, ACTION_BROWSE_MAP_LIST_CLICKED, ACTION_ONBOARDING_USP, ACTION_ONBOARDING_COLLECTION_TIMES, ACTION_OPEN_FAVORITE_REMINDER_PAGE, ACTION_CLICK_REMINDER, ACTION_SAVE_FAVORITE_REMINDER, ACTION_TURN_OFF_FAVORITE_REMINDER, ACTION_ITEM_DESCRIPTION_TRANSLATE, ACTION_OPEN_LOYALTY_CARD_PAGE, ACTION_CLOSE_LOYALTY_CARD_PAGE, ACTION_CLOSE_LOYALTY_CARD_INITIAL_SECTION, ACTION_SEE_LOYALTY_CARD_VOUCHER, ACTION_CLOSE_LOYALTY_CARD_COMPLETE_SECTION, ACTION_LOCATION_ADDED, ACTION_LOCATION_CHANGED, ACTION_CLICK_INGREDIENT_TAG, ACTION_ITEM_PAGE_SCROLL, ACTION_CLICK_DIRECTIONS, ACTION_OPEN_CHAT_WIDGET, ACTION_LOGO_CLICKED, ACTION_ADDRESS_CLICKED, APPSFLYER_ACTION_STORE_SUBMIT, APPSFLYER_FIRST_PURCHASE, TEMP_BUTTON_ASK_A_FRIEND, TEMP_ACTION_ACCT_DETAILS_FIELD_SAVE, TEMP_ACTION_UNFOLD_ITEM_DESCRIPTION, TEMP_ACTION_TRACK_PARCEL, TEMP_ACTION_SEE_ITEM_FAQ, TEMP_ACTION_UNFOLD_ITEM_FAQ, TEMP_ACTION_CLICK_FAQ_LINK, TEMP_ACTION_SOLD_OUT, TEMP_ACTION_SEE_CAROUSEL_ELEMENT, TEMP_LIVE_LOCATION_CLICKED, TEMP_USE_VOUCHER_TOGGLE, TEMP_ACTION_SHARE_ITEM, TEMP_ACTION_INGREDIENT_CAROUSEL_VIEWS, TEMP_SCREEN_POP_UP_CHANGE_PUSH_SETTINGS, TEMP_ACCEPT_POP_UP_CHANGE_PUSH_SETTINGS, TEMP_REJECT_POP_UP_CHANGE_PUSH_SETTINGS, DEBUG_SYSTEM_LOG_OUT, DEBUG_CHECKOUT_FAILED, DEBUG_PAYMENT_FAILED, DEBUG_ADYEN_REDIRECT_HANDLE_INTENT, DEBUG_ADYEN_REDIRECT_SENDING_ADDITIONAL_DETAILS, DEBUG_ADYEN_REDIRECT_ACTION_TYPE, DEBUG_ADYEN_BIOMETRICS_FAILED, DEBUG_ADYEN_BIOMETRICS, DEBUG_ADYEN_BIOMETRICS_PAY, DEBUG_ADYEN_COMPONENT_POLLING_ERROR, DEBUG_ADYEN_REDIRECT_FAIL, DEBUG_IMAGE_TOO_BIG, APP_PURCHASE_COMPLETED, APP_POTENTIALLY_GOOD_USER_SIGNED_UP, MAGIC_PARCEL_PURCHASE, CHARITY_LOGIN_CONTINUE_AS_CHARITY, SCREEN_CHARITY_LOGIN, CHARITY_LOGIN_STARTED, CHARITY_LOGIN_BACK, CHARITY_LOGIN_LEARN_MORE, CHARITY_LOGIN_EMAIL_PROVIDED, SCREEN_CHARITY_LOGIN_VERIFY_EMAIL, CHARITY_LOGIN_DIDNT_RECEIVE_EMAIL, CHARITY_LOGIN_CHARITY_COUNTRY, CHARITY_LOGIN_CHARITY_USER_TERMS, CHARITY_LOGIN_PRIVACY_POLICY, SCREEN_CHARITY_LOGIN_WELCOME, CHARITY_LOGIN_CONNECT_TO_CHARITY, CHARITY_LOGIN_WELCOME_CANCEL, SCREEN_CHARITY_LOGIN_CHARITY_ID, CHARITY_LOGIN_INVALID_CHARITY_ID, CHARITY_LOGIN_NO_CHARITY_ID, SCREEN_CHARITY_LOGIN_CONNECTED_TO_CHARITY, CHARITY_LOGIN_UPDATED_DONE, CHARITY_LOGIN_CONTACT_US_CLICKED, CHARITY_LOGIN_CONTACT_US_CLOSED, CHARITY_LOGIN_CLOSE_WINDOW, CHARITY_LOGIN_GO_BACK_WINDOW, TEMP_OTHER_CLICKED, CHARITY_LOGIN_ERROR, SCREEN_FRIDGE_INTRO, ACTION_START_CAMERA, SCREEN_RECIPE, SCREEN_SAVED_RECIPE_LIST, ACTION_CLOSE_CAMERA_ACCESS, ACTION_UPLOAD_PHOTO, SCREEN_RECIPE_GENERATION, SCREEN_FRIDGE_WARNING, SCREEN_FRIDGE_BANNER, ACTION_DISMISS_FRIDGE_BANNER, ACTION_DELETE_PHOTO, SCREEN_RECIPE_LIST, ACTION_TAP_RECIPE_TAB, ACTION_CLOSE_RECIPE, ACTION_SAVE_RECIPE, ACTION_UNSAVE_RECIPE, SCREEN_RECIPE_PREFERENCES, SCREEN_RECIPE_HISTORY, UI_INTERACTION};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final boolean c() {
        return this.amplitude;
    }

    public final boolean d() {
        return this.appsflyer;
    }

    public final boolean e() {
        return this.braze;
    }

    public final String f() {
        return this.eventName;
    }

    public final boolean g() {
        return this.facebook;
    }

    public final boolean h() {
        return this.firebase;
    }
}
