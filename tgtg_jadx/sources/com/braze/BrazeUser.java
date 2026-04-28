package com.braze;

import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.appsflyer.AdRevenueScheme;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.managers.r;
import com.braze.models.IBrazeLocation;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.storage.i3;
import com.braze.storage.u3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0015J\u0015\u00103\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0015J\u0017\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u0010\u0015J\u0017\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u0010\u0015J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001e¢\u0006\u0004\b:\u0010<J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020=¢\u0006\u0004\b:\u0010>J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020?¢\u0006\u0004\b:\u0010@J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0012J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020A¢\u0006\u0004\b:\u0010BJ)\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u0010EJ\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020F¢\u0006\u0004\b:\u0010GJ\u001d\u0010H\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bH\u0010\u0012J\u001d\u0010I\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bI\u0010\u0012J%\u0010L\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u000e\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060J¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u0015J\u001d\u0010P\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010O\u001a\u00020?¢\u0006\u0004\bP\u0010@J!\u0010R\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\b\b\u0002\u0010Q\u001a\u00020\u001eH\u0007¢\u0006\u0004\bR\u0010<J\u0015\u0010S\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\bS\u0010\u0015J\u0017\u0010V\u001a\u00020\u00102\b\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WJC\u0010^\u001a\u00020]2\u0006\u0010X\u001a\u00020A2\u0006\u0010Y\u001a\u00020A2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010AH\u0007¢\u0006\u0004\b^\u0010_J%\u0010`\u001a\u00020]2\u0006\u00108\u001a\u00020\u00062\u0006\u0010X\u001a\u00020A2\u0006\u0010Y\u001a\u00020A¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020]2\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\bb\u0010cJ)\u0010d\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010D\u001a\u00020\u0010H\u0007¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010O\u001a\u00020?¢\u0006\u0004\bf\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010jR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR$\u0010o\u001a\u00020\u00062\u0006\u0010o\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010c¨\u0006s"}, d2 = {"Lcom/braze/BrazeUser;", "", "Lcom/braze/storage/u3;", "userCache", "Lcom/braze/managers/m0;", "brazeManager", "", "internalUserId", "Lcom/braze/managers/p0;", "locationManager", "Lcom/braze/storage/i3;", "serverConfigStorageProvider", "<init>", "(Lcom/braze/storage/u3;Lcom/braze/managers/m0;Ljava/lang/String;Lcom/braze/managers/p0;Lcom/braze/storage/i3;)V", "alias", AnnotatedPrivateKey.LABEL, "", "addAlias", "(Ljava/lang/String;Ljava/lang/String;)Z", EContextPaymentMethod.FIRST_NAME, "setFirstName", "(Ljava/lang/String;)Z", EContextPaymentMethod.LAST_NAME, "setLastName", "email", "setEmail", "Lcom/braze/enums/Gender;", "gender", "setGender", "(Lcom/braze/enums/Gender;)Z", "", "year", "Lcom/braze/enums/Month;", "month", "day", "setDateOfBirth", "(ILcom/braze/enums/Month;I)Z", AdRevenueScheme.COUNTRY, "setCountry", "homeCity", "setHomeCity", "language", "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "(Lcom/braze/enums/NotificationSubscriptionType;)Z", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "phoneNumber", "setPhoneNumber", "lineId", "setLineId", "key", "value", "setCustomUserAttribute", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;I)Z", "", "(Ljava/lang/String;F)Z", "", "(Ljava/lang/String;J)Z", "", "(Ljava/lang/String;D)Z", "Lorg/json/JSONObject;", "merge", "(Ljava/lang/String;Lorg/json/JSONObject;Z)Z", "Lorg/json/JSONArray;", "(Ljava/lang/String;Lorg/json/JSONArray;)Z", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", "values", "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "setCustomUserAttributeToNow", "secondsFromEpoch", "setCustomUserAttributeToSecondsFromEpoch", "incrementValue", "incrementCustomUserAttribute", "unsetCustomUserAttribute", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "setAttributionData", "(Lcom/braze/models/outgoing/AttributionData;)Z", "latitude", "longitude", IBrazeLocation.ALTITUDE, "accuracy", "verticalAccuracy", "", "setLastKnownLocation", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "setLocationCustomAttribute", "(Ljava/lang/String;DD)V", "unsetLocationCustomAttribute", "(Ljava/lang/String;)V", "setCustomAttribute", "(Ljava/lang/String;Ljava/lang/Object;Z)Z", "setCustomAttributeToSecondsFromEpoch", "Lcom/braze/storage/u3;", "Lcom/braze/managers/m0;", "Ljava/lang/String;", "Lcom/braze/managers/p0;", "Lcom/braze/storage/i3;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeUser {
    private final com.braze.managers.m0 brazeManager;
    private volatile String internalUserId;
    private final com.braze.managers.p0 locationManager;
    private final i3 serverConfigStorageProvider;
    private final u3 userCache;
    private final ReentrantLock userIdLock;

    public BrazeUser(u3 u3Var, com.braze.managers.m0 m0Var, String str, com.braze.managers.p0 p0Var, i3 i3Var) {
        u3Var.getClass();
        m0Var.getClass();
        str.getClass();
        p0Var.getClass();
        i3Var.getClass();
        this.userCache = u3Var;
        this.brazeManager = m0Var;
        this.internalUserId = str;
        this.locationManager = p0Var;
        this.serverConfigStorageProvider = i3Var;
        this.userIdLock = new ReentrantLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_userId_$lambda$1(String str) {
        return e0.f.k("User object user id set to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$4() {
        return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$5() {
        return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$7(String str) {
        return e0.f.k("Failed to set alias: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$51() {
        return "Custom attribute key was invalid. Not adding to attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$52(String str) {
        return w.a0.p("Failed to add custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$27() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$29(String str) {
        return e0.f.k("Failed to add user to subscription group ", str);
    }

    public static /* synthetic */ String f0(long j9, String str) {
        return setCustomUserAttributeToSecondsFromEpoch$lambda$57(str, j9);
    }

    public static /* synthetic */ boolean incrementCustomUserAttribute$default(BrazeUser brazeUser, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        return brazeUser.incrementCustomUserAttribute(str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$58(String str, int i11) {
        return "Failed to increment custom attribute " + str + " by " + i11 + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$53() {
        return "Custom attribute key was invalid. Not removing from attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$54(String str) {
        return w.a0.p("Failed to remove custom attribute with key '", str, "'.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$30() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$32(String str) {
        return e0.f.k("Failed to remove user from subscription group ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$61() {
        return "Failed to set attribution data.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$19() {
        return "Invalid country parameter: country is required to be non-blank. Not setting country.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$20(String str) {
        return e0.f.k("Failed to set country to: ", str);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$70() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$73$lambda$71(String str, Object obj) {
        return "Could not add unsupported custom attribute value with key: " + str + " and value: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$73$lambda$72(String str, Object obj) {
        return "Could not build NestedCustomAttributeEvent for key " + str + " and " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttributeArray$lambda$55(String str) {
        return w.a0.p("Failed to set custom attribute array with key: '", str, "'.");
    }

    public static /* synthetic */ boolean setCustomUserAttribute$default(BrazeUser brazeUser, String str, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return brazeUser.setCustomUserAttribute(str, jSONObject, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$43(String str) {
        return w.a0.p("Failed to set custom boolean attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$44(String str) {
        return w.a0.p("Failed to set custom integer attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$45(String str) {
        return w.a0.p("Failed to set custom float attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$46(String str) {
        return w.a0.p("Failed to set custom long attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$47(String str) {
        return w.a0.p("Failed to set custom string attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$48(String str) {
        return w.a0.p("Failed to set custom double attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$49(String str, JSONObject jSONObject) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Failed to set custom json attribute ", str, " with value \n", JsonUtils.getPrettyPrintedString(jSONObject), ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$50(String str, JSONArray jSONArray) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Failed to set custom json attribute ", str, " with value \n", JsonUtils.getPrettyPrintedString(jSONArray), ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeToNow$lambda$56(String str) {
        return w.a0.p("Failed to set custom attribute ", str, " to now.");
    }

    private static final String setCustomUserAttributeToSecondsFromEpoch$lambda$57(String str, long j9) {
        StringBuilder sbN = b3.i.n(j9, "Failed to set custom attribute ", str, " to ");
        sbN.append(" seconds from epoch.");
        return sbN.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$18(int i11, Month month, int i12) {
        StringBuilder sbR = r8.k.r(i11, month.getValue(), "Failed to set date of birth to: ", "-", "-");
        sbR.append(i12);
        return sbR.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$12() {
        return "Invalid email parameter: email is required to be non-empty. Not setting email.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$15$lambda$14(String str) {
        return e0.f.k("Email address is not valid: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$16(String str) {
        return e0.f.k("Failed to set email to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$25(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set email notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$8() {
        return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$9(String str) {
        return e0.f.k("Failed to set first name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$17(Gender gender) {
        return "Failed to set gender to: " + gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$21() {
        return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$22(String str) {
        return e0.f.k("Failed to set home city to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$23() {
        return "Invalid language parameter: language is required to be non-empty. Not setting language.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$24(String str) {
        return e0.f.k("Failed to set language to: ", str);
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d3, double d11, Double d12, Double d13, Double d14, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            d12 = null;
        }
        if ((i11 & 8) != 0) {
            d13 = null;
        }
        if ((i11 & 16) != 0) {
            d14 = null;
        }
        brazeUser.setLastKnownLocation(d3, d11, d12, d13, d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastKnownLocation$lambda$62() {
        return "Failed to manually set location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$10() {
        return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$11(String str) {
        return e0.f.k("Failed to set last name to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$38() {
        return "Invalid LINE ID parameter: LINE ID is required to be non-empty or null. Not setting LINE ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$41$lambda$40(String str) {
        return e0.f.k("LINE ID is longer than 33 characters: Failed to set LINE ID: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$42(String str) {
        return e0.f.k("Failed to set LINE ID to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$63() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$64(double d3, double d11) {
        return "Cannot set custom location attribute due with invalid latitude '" + d3 + " and longitude '" + d11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$66(String str, double d3, double d11) {
        return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d3 + "' and longitude '" + d11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$33() {
        return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$36$lambda$35(String str) {
        return e0.f.k("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$37(String str) {
        return e0.f.k("Failed to set phone number to: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$26(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set push notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$59() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$60(String str) {
        return w.a0.p("Failed to unset custom attribute ", str, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetLocationCustomAttribute$lambda$67() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetLocationCustomAttribute$lambda$69(String str) {
        return w.a0.p("Failed to unset custom location attribute with key '", str, "'");
    }

    public final boolean addAlias(String alias, String label) {
        BrazeUser brazeUser;
        alias.getClass();
        label.getClass();
        if (StringsKt.H(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(18), 6, (Object) null);
            return false;
        }
        if (StringsKt.H(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(19), 6, (Object) null);
            return false;
        }
        try {
            com.braze.models.k kVarS = com.braze.models.outgoing.event.b.f10176g.s(alias, label);
            if (kVarS == null) {
                return false;
            }
            brazeUser = this;
            try {
                return ((r) brazeUser.brazeManager).a(kVarS);
            } catch (Exception e5) {
                e = e5;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new e2(alias, 15), 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final boolean addToCustomAttributeArray(String key, String value) {
        key.getClass();
        value.getClass();
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(10), 6, (Object) null);
                return false;
            }
            if (com.braze.support.d.c(value)) {
                com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
                if (kVarA != null) {
                    return ((r) this.brazeManager).a(kVarA);
                }
            }
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new e2(key, 5), 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String subscriptionGroupId) {
        BrazeUser brazeUser;
        subscriptionGroupId.getClass();
        try {
            if (StringsKt.H(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(5), 6, (Object) null);
                return false;
            }
            com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(subscriptionGroupId, com.braze.enums.g.SUBSCRIBED);
            if (kVarA == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((r) brazeUser.brazeManager).a(kVarA);
                return true;
            } catch (Exception e5) {
                e = e5;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new v0(subscriptionGroupId, 24), 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(String key, int incrementValue) {
        key.getClass();
        try {
            if (com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(ValidationUtils.ensureBrazeFieldLength(key), incrementValue);
                if (kVarA != null) {
                    return ((r) this.brazeManager).a(kVarA);
                }
            }
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new a2(key, incrementValue, 0), 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(String key, String value) {
        key.getClass();
        value.getClass();
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(21), 6, (Object) null);
                return false;
            }
            if (com.braze.support.d.c(value)) {
                com.braze.models.k kVarQ = com.braze.models.outgoing.event.b.f10176g.q(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
                if (kVarQ != null) {
                    return ((r) this.brazeManager).a(kVarQ);
                }
            }
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new v0(key, 22), 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(String subscriptionGroupId) {
        BrazeUser brazeUser;
        subscriptionGroupId.getClass();
        try {
            if (StringsKt.H(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(11), 6, (Object) null);
                return false;
            }
            com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(subscriptionGroupId, com.braze.enums.g.UNSUBSCRIBED);
            if (kVarA == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((r) brazeUser.brazeManager).a(kVarA);
                return true;
            } catch (Exception e5) {
                e = e5;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(subscriptionGroupId, 11), 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new y(this, attributionData, null), 3);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new w1(15), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCountry(String country) {
        BrazeUser brazeUser;
        if (country == null) {
            brazeUser = this;
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new z(brazeUser, country, null), 3);
            return true;
        }
        try {
            if (StringsKt.H(country)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(6), 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new z(brazeUser, country, null), 3);
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new v0(country, 26), 4, (Object) null);
        return false;
    }

    public final boolean setCustomAttribute(String key, Object value, boolean merge) {
        key.getClass();
        value.getClass();
        if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(3), 6, (Object) null);
            return false;
        }
        String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        Object objA = com.braze.support.d.f10754a.a(value, 0);
        if (objA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new z1(value, 0, key), 6, (Object) null);
            return false;
        }
        if (!(objA instanceof JSONObject) || !merge) {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new a0(this, strEnsureBrazeFieldLength, objA, null), 3);
            return true;
        }
        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(strEnsureBrazeFieldLength, (JSONObject) objA);
        if (kVarA != null) {
            return ((r) this.brazeManager).a(kVarA);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new z1(objA, 1, strEnsureBrazeFieldLength), 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(String key, String[] values) {
        key.getClass();
        values.getClass();
        try {
            if (com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                String strEnsureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
                ArrayList arrayList = new ArrayList(values.length);
                for (String str : values) {
                    arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
                }
                com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(strEnsureBrazeFieldLength, (String[]) arrayList.toArray(new String[0]));
                if (kVarA != null) {
                    return ((r) this.brazeManager).a(kVarA);
                }
            }
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new e2(key, 16), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        key.getClass();
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(secondsFromEpoch), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, boolean value) {
        String str;
        key.getClass();
        try {
            str = key;
        } catch (Exception e5) {
            e = e5;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Boolean.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(str, 12), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToNow(String key) {
        key.getClass();
        try {
            return setCustomAttributeToSecondsFromEpoch(key, DateTimeUtils.nowInSeconds());
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new e2(key, 7), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        key.getClass();
        try {
            return setCustomAttributeToSecondsFromEpoch(key, secondsFromEpoch);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new f2(0, secondsFromEpoch, key), 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int year, Month month, int day) {
        int i11;
        int i12;
        month.getClass();
        try {
            i11 = year;
            i12 = day;
        } catch (Exception e5) {
            e = e5;
            i11 = year;
            i12 = day;
        }
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new b0(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i11, month.getValue(), i12, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new g2(i11, month, i12), 4, (Object) null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x002a, B:18:0x0038, B:25:0x004d, B:28:0x0053, B:29:0x0056, B:32:0x0063, B:35:0x006a, B:37:0x0083), top: B:47:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setEmail(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L27
            boolean r3 = kotlin.text.StringsKt.H(r1)     // Catch: java.lang.Exception -> L21
            if (r3 != r0) goto L27
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L21
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L21
            com.braze.w1 r9 = new com.braze.w1     // Catch: java.lang.Exception -> L21
            r0 = 20
            r9.<init>(r0)     // Catch: java.lang.Exception -> L21
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r20
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L21
            return r2
        L21:
            r0 = move-exception
            r13 = r20
        L24:
            r15 = r0
            goto L93
        L27:
            r3 = 0
            if (r1 == 0) goto L60
            int r4 = r1.length()     // Catch: java.lang.Exception -> L21
            int r4 = r4 - r0
            r5 = r2
            r6 = r5
        L31:
            if (r5 > r4) goto L56
            if (r6 != 0) goto L37
            r7 = r5
            goto L38
        L37:
            r7 = r4
        L38:
            char r7 = r1.charAt(r7)     // Catch: java.lang.Exception -> L21
            r8 = 32
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r7, r8)     // Catch: java.lang.Exception -> L21
            if (r7 > 0) goto L46
            r7 = r0
            goto L47
        L46:
            r7 = r2
        L47:
            if (r6 != 0) goto L50
            if (r7 != 0) goto L4d
            r6 = r0
            goto L31
        L4d:
            int r5 = r5 + 1
            goto L31
        L50:
            if (r7 != 0) goto L53
            goto L56
        L53:
            int r4 = r4 + (-1)
            goto L31
        L56:
            int r4 = r4 + r0
            java.lang.CharSequence r4 = r1.subSequence(r5, r4)     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L21
            goto L61
        L60:
            r4 = r3
        L61:
            if (r4 == 0) goto L83
            boolean r5 = com.braze.support.ValidationUtils.isValidEmailAddress(r4)     // Catch: java.lang.Exception -> L21
            if (r5 == 0) goto L6a
            goto L83
        L6a:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L21
            com.braze.e2 r0 = new com.braze.e2     // Catch: java.lang.Exception -> L21
            r3 = 17
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L21
            r18 = 7
            r19 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r13 = r20
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L21
            return r2
        L83:
            com.braze.coroutine.f r5 = com.braze.coroutine.f.f9657a     // Catch: java.lang.Exception -> L21
            com.braze.c0 r6 = new com.braze.c0     // Catch: java.lang.Exception -> L21
            r13 = r20
            r6.<init>(r13, r4, r3)     // Catch: java.lang.Exception -> L91
            r4 = 3
            v80.f0.B(r5, r3, r3, r6, r4)     // Catch: java.lang.Exception -> L91
            return r0
        L91:
            r0 = move-exception
            goto L24
        L93:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.W
            com.braze.e2 r0 = new com.braze.e2
            r3 = 18
            r0.<init>(r1, r3)
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setEmail(java.lang.String):boolean");
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType emailNotificationSubscriptionType) {
        emailNotificationSubscriptionType.getClass();
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new d0(this, emailNotificationSubscriptionType, null), 3);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new d2(emailNotificationSubscriptionType, 0), 4, (Object) null);
            return false;
        }
    }

    public final boolean setFirstName(String firstName) {
        BrazeUser brazeUser;
        if (firstName == null) {
            brazeUser = this;
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new e0(brazeUser, firstName, null), 3);
            return true;
        }
        try {
            if (StringsKt.H(firstName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(9), 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new e0(brazeUser, firstName, null), 3);
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(firstName, 4), 4, (Object) null);
        return false;
    }

    public final boolean setGender(Gender gender) {
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new f0(this, gender, null), 3);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new t0(gender, 5), 4, (Object) null);
            return false;
        }
    }

    public final boolean setHomeCity(String homeCity) {
        BrazeUser brazeUser;
        if (homeCity == null) {
            brazeUser = this;
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new g0(brazeUser, homeCity, null), 3);
            return true;
        }
        try {
            if (StringsKt.H(homeCity)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(14), 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new g0(brazeUser, homeCity, null), 3);
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(homeCity, 10), 4, (Object) null);
        return false;
    }

    public final boolean setLanguage(String language) {
        BrazeUser brazeUser;
        if (language == null) {
            brazeUser = this;
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new h0(brazeUser, language, null), 3);
            return true;
        }
        try {
            if (StringsKt.H(language)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(8), 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new h0(brazeUser, language, null), 3);
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(language, 3), 4, (Object) null);
        return false;
    }

    public final void setLastKnownLocation(double latitude, double longitude, Double altitude, Double accuracy, Double verticalAccuracy) {
        try {
            ((com.braze.managers.p) this.locationManager).a(new BrazeLocation(latitude, longitude, altitude, accuracy, verticalAccuracy));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new w1(16), 4, (Object) null);
        }
    }

    public final boolean setLastName(String lastName) {
        BrazeUser brazeUser;
        if (lastName == null) {
            brazeUser = this;
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new i0(brazeUser, lastName, null), 3);
            return true;
        }
        try {
            if (StringsKt.H(lastName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(13), 6, (Object) null);
                return false;
            }
            brazeUser = this;
            try {
                v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new i0(brazeUser, lastName, null), 3);
                return true;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(lastName, 9), 4, (Object) null);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: Exception -> 0x0021, TryCatch #1 {Exception -> 0x0021, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x002a, B:18:0x0038, B:25:0x004d, B:28:0x0053, B:29:0x0056, B:32:0x0063, B:35:0x006a, B:37:0x0084), top: B:47:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setLineId(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L27
            boolean r3 = kotlin.text.StringsKt.H(r1)     // Catch: java.lang.Exception -> L21
            if (r3 != r0) goto L27
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L21
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L21
            com.braze.w1 r9 = new com.braze.w1     // Catch: java.lang.Exception -> L21
            r0 = 17
            r9.<init>(r0)     // Catch: java.lang.Exception -> L21
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r20
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L21
            return r2
        L21:
            r0 = move-exception
            r13 = r20
        L24:
            r15 = r0
            goto L94
        L27:
            r3 = 0
            if (r1 == 0) goto L60
            int r4 = r1.length()     // Catch: java.lang.Exception -> L21
            int r4 = r4 - r0
            r5 = r2
            r6 = r5
        L31:
            if (r5 > r4) goto L56
            if (r6 != 0) goto L37
            r7 = r5
            goto L38
        L37:
            r7 = r4
        L38:
            char r7 = r1.charAt(r7)     // Catch: java.lang.Exception -> L21
            r8 = 32
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r7, r8)     // Catch: java.lang.Exception -> L21
            if (r7 > 0) goto L46
            r7 = r0
            goto L47
        L46:
            r7 = r2
        L47:
            if (r6 != 0) goto L50
            if (r7 != 0) goto L4d
            r6 = r0
            goto L31
        L4d:
            int r5 = r5 + 1
            goto L31
        L50:
            if (r7 != 0) goto L53
            goto L56
        L53:
            int r4 = r4 + (-1)
            goto L31
        L56:
            int r4 = r4 + r0
            java.lang.CharSequence r4 = r1.subSequence(r5, r4)     // Catch: java.lang.Exception -> L21
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L21
            goto L61
        L60:
            r4 = r3
        L61:
            if (r4 == 0) goto L84
            boolean r5 = com.braze.support.ValidationUtils.isValidLineId(r4)     // Catch: java.lang.Exception -> L21
            if (r5 == 0) goto L6a
            goto L84
        L6a:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L21
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L21
            com.braze.e2 r0 = new com.braze.e2     // Catch: java.lang.Exception -> L21
            r3 = 13
            r0.<init>(r4, r3)     // Catch: java.lang.Exception -> L21
            r18 = 6
            r19 = 0
            r15 = 0
            r16 = 0
            r13 = r20
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L21
            return r2
        L84:
            com.braze.coroutine.f r5 = com.braze.coroutine.f.f9657a     // Catch: java.lang.Exception -> L21
            com.braze.j0 r6 = new com.braze.j0     // Catch: java.lang.Exception -> L21
            r13 = r20
            r6.<init>(r13, r4, r3)     // Catch: java.lang.Exception -> L92
            r4 = 3
            v80.f0.B(r5, r3, r3, r6, r4)     // Catch: java.lang.Exception -> L92
            return r0
        L92:
            r0 = move-exception
            goto L24
        L94:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.W
            com.braze.e2 r0 = new com.braze.e2
            r3 = 14
            r0.<init>(r1, r3)
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setLineId(java.lang.String):boolean");
    }

    public final void setLocationCustomAttribute(String key, double latitude, double longitude) {
        String str;
        BrazeUser brazeUser;
        BrazeUser brazeUser2 = this;
        key.getClass();
        try {
            str = key;
            try {
                try {
                    if (!com.braze.support.d.a(str, brazeUser2.serverConfigStorageProvider.e())) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser2, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(7), 6, (Object) null);
                        return;
                    }
                    if (!ValidationUtils.isValidLocation(latitude, longitude)) {
                        brazeUser2 = this;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser2, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new e1(latitude, longitude, 2), 6, (Object) null);
                        return;
                    }
                    brazeUser = this;
                    try {
                        com.braze.models.k kVarA = com.braze.models.outgoing.event.b.f10176g.a(ValidationUtils.ensureBrazeFieldLength(str), latitude, longitude);
                        if (kVarA != null) {
                            ((r) brazeUser.brazeManager).a(kVarA);
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e11) {
                    e = e11;
                    brazeUser = this;
                }
            } catch (Exception e12) {
                e = e12;
                brazeUser = brazeUser2;
            }
        } catch (Exception e13) {
            e = e13;
            str = key;
        }
        Exception exc = e;
        BrazeUser brazeUser3 = brazeUser;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser3, BrazeLogger.Priority.W, (Throwable) exc, false, (Function0) new c2(str, latitude, longitude, 0), 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:4:0x0006, B:6:0x000c, B:13:0x0029, B:18:0x0037, B:25:0x004c, B:28:0x0052, B:29:0x0055, B:32:0x0062, B:35:0x0069, B:37:0x0083), top: B:45:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setPhoneNumber(java.lang.String r21) {
        /*
            r20 = this;
            r1 = r21
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L26
            boolean r3 = kotlin.text.StringsKt.H(r1)     // Catch: java.lang.Exception -> L20
            if (r3 != r0) goto L26
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L20
            com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L20
            com.braze.w1 r9 = new com.braze.w1     // Catch: java.lang.Exception -> L20
            r0 = 2
            r9.<init>(r0)     // Catch: java.lang.Exception -> L20
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            r5 = r20
            com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L20
            return r2
        L20:
            r0 = move-exception
            r13 = r20
        L23:
            r15 = r0
            goto L93
        L26:
            r3 = 0
            if (r1 == 0) goto L5f
            int r4 = r1.length()     // Catch: java.lang.Exception -> L20
            int r4 = r4 - r0
            r5 = r2
            r6 = r5
        L30:
            if (r5 > r4) goto L55
            if (r6 != 0) goto L36
            r7 = r5
            goto L37
        L36:
            r7 = r4
        L37:
            char r7 = r1.charAt(r7)     // Catch: java.lang.Exception -> L20
            r8 = 32
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r7, r8)     // Catch: java.lang.Exception -> L20
            if (r7 > 0) goto L45
            r7 = r0
            goto L46
        L45:
            r7 = r2
        L46:
            if (r6 != 0) goto L4f
            if (r7 != 0) goto L4c
            r6 = r0
            goto L30
        L4c:
            int r5 = r5 + 1
            goto L30
        L4f:
            if (r7 != 0) goto L52
            goto L55
        L52:
            int r4 = r4 + (-1)
            goto L30
        L55:
            int r4 = r4 + r0
            java.lang.CharSequence r4 = r1.subSequence(r5, r4)     // Catch: java.lang.Exception -> L20
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L20
            goto L60
        L5f:
            r4 = r3
        L60:
            if (r4 == 0) goto L83
            boolean r5 = com.braze.support.ValidationUtils.isValidPhoneNumber(r4)     // Catch: java.lang.Exception -> L20
            if (r5 == 0) goto L69
            goto L83
        L69:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L20
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L20
            com.braze.v0 r0 = new com.braze.v0     // Catch: java.lang.Exception -> L20
            r3 = 25
            r0.<init>(r4, r3)     // Catch: java.lang.Exception -> L20
            r18 = 6
            r19 = 0
            r15 = 0
            r16 = 0
            r13 = r20
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L20
            return r2
        L83:
            com.braze.coroutine.f r5 = com.braze.coroutine.f.f9657a     // Catch: java.lang.Exception -> L20
            com.braze.k0 r6 = new com.braze.k0     // Catch: java.lang.Exception -> L20
            r13 = r20
            r6.<init>(r13, r4, r3)     // Catch: java.lang.Exception -> L91
            r4 = 3
            v80.f0.B(r5, r3, r3, r6, r4)     // Catch: java.lang.Exception -> L91
            return r0
        L91:
            r0 = move-exception
            goto L23
        L93:
            com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.W
            com.braze.e2 r0 = new com.braze.e2
            r3 = 1
            r0.<init>(r1, r3)
            r18 = 4
            r19 = 0
            r16 = 0
            r17 = r0
            com.braze.support.BrazeLogger.brazelog$default(r12, r13, r14, r15, r16, r17, r18, r19)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.BrazeUser.setPhoneNumber(java.lang.String):boolean");
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType pushNotificationSubscriptionType) {
        pushNotificationSubscriptionType.getClass();
        try {
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new l0(this, pushNotificationSubscriptionType, null), 3);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new d2(pushNotificationSubscriptionType, 1), 4, (Object) null);
            return false;
        }
    }

    public final void setUserId(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new e2(str, 6), 6, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!Intrinsics.areEqual(this.internalUserId, "") && !Intrinsics.areEqual(this.internalUserId, str)) {
                throw new IllegalArgumentException(("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + str + "]").toString());
            }
            this.internalUserId = str;
            v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new n0(this, str, null), 3);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean unsetCustomUserAttribute(String key) {
        key.getClass();
        try {
            if (com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                v80.f0.B(com.braze.coroutine.f.f9657a, null, null, new m0(this, key, null), 3);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(4), 6, (Object) null);
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new v0(key, 23), 4, (Object) null);
            return false;
        }
    }

    public final void unsetLocationCustomAttribute(String key) {
        key.getClass();
        try {
            if (!com.braze.support.d.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new w1(12), 6, (Object) null);
                return;
            }
            com.braze.models.k kVarM = com.braze.models.outgoing.event.b.f10176g.m(ValidationUtils.ensureBrazeFieldLength(key));
            if (kVarM != null) {
                ((r) this.brazeManager).a(kVarM);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new e2(key, 8), 4, (Object) null);
        }
    }

    public final void setLastKnownLocation(double d3, double d11, Double d12) {
        setLastKnownLocation$default(this, d3, d11, d12, null, null, 24, null);
    }

    public final void setLastKnownLocation(double d3, double d11, Double d12, Double d13) {
        setLastKnownLocation$default(this, d3, d11, d12, d13, null, 16, null);
    }

    public final void setLastKnownLocation(double d3, double d11) {
        setLastKnownLocation$default(this, d3, d11, null, null, null, 28, null);
    }

    public final boolean setCustomUserAttribute(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        return setCustomUserAttribute$default(this, str, jSONObject, false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, int value) {
        String str;
        key.getClass();
        try {
            str = key;
        } catch (Exception e5) {
            e = e5;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Integer.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(str, 2), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, float value) {
        String str;
        key.getClass();
        try {
            str = key;
        } catch (Exception e5) {
            e = e5;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Float.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new e2(str, 0), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, long value) {
        String str;
        key.getClass();
        try {
            str = key;
        } catch (Exception e5) {
            e = e5;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Long.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new v0(str, 27), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, String value) {
        key.getClass();
        value.getClass();
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new v0(key, 28), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double value) {
        String str;
        key.getClass();
        try {
            str = key;
        } catch (Exception e5) {
            e = e5;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Double.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (Function0) new v0(str, 29), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value, boolean merge) {
        key.getClass();
        value.getClass();
        try {
            return setCustomAttribute(key, value, merge);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new b2(key, value, 0), 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONArray value) {
        key.getClass();
        value.getClass();
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new bs.b(11, key, value), 4, (Object) null);
            return false;
        }
    }

    public final boolean incrementCustomUserAttribute(String str) {
        str.getClass();
        return incrementCustomUserAttribute$default(this, str, 0, 2, null);
    }

    public final boolean setCustomAttribute(String str, Object obj) {
        str.getClass();
        obj.getClass();
        return setCustomAttribute$default(this, str, obj, false, 4, null);
    }
}
