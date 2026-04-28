package com.braze.ui;

import a3.p;
import a3.y0;
import android.content.Context;
import android.webkit.JavascriptInterface;
import c60.e;
import cg.x0;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.appsflyer.AdRevenueScheme;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.f1;
import com.braze.models.inappmessage.m;
import com.braze.models.inappmessage.n;
import com.braze.support.BrazeLogger;
import e0.f;
import j4.s;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\tH\u0007J \u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J \u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0007J\u0018\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0007J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u00108\u001a\u0004\u0018\u0001092\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0007J(\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J!\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010>2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setFirstName", "", EContextPaymentMethod.FIRST_NAME, "", "setLastName", EContextPaymentMethod.LAST_NAME, "setEmail", "email", "setGender", "genderString", "setDateOfBirth", "year", "month", "day", "setCountry", AdRevenueScheme.COUNTRY, "setLanguage", "language", "setHomeCity", "homeCity", "setEmailNotificationSubscriptionType", "subscriptionType", "setPushNotificationSubscriptionType", "setPhoneNumber", "phoneNumber", "setLineId", "lineId", "setCustomUserAttributeJSON", "key", "jsonStringValue", "merge", "", "setCustomUserAttributeArray", "jsonArrayString", "addToCustomAttributeArray", "value", "removeFromCustomAttributeArray", "incrementCustomUserAttribute", "attribute", "setCustomLocationAttribute", "latitude", "longitude", "addAlias", "alias", AnnotatedPrivateKey.LABEL, "addToSubscriptionGroup", "subscriptionGroupId", "removeFromSubscriptionGroup", "monthFromInt", "Lcom/braze/enums/Month;", "subscriptionTypeFromJavascriptString", "Lcom/braze/enums/NotificationSubscriptionType;", "setCustomAttribute", "user", "Lcom/braze/BrazeUser;", "parseStringArrayFromJsonString", "", "(Ljava/lang/String;)[Ljava/lang/String;", "parseGender", "Lcom/braze/enums/Gender;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserJavascriptInterfaceBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserJavascriptInterfaceBase.kt\ncom/braze/ui/UserJavascriptInterfaceBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,349:1\n1#2:350\n37#3:351\n36#3,3:352\n*S KotlinDebug\n*F\n+ 1 UserJavascriptInterfaceBase.kt\ncom/braze/ui/UserJavascriptInterfaceBase\n*L\n300#1:351\n300#1:352,3\n*E\n"})
public class UserJavascriptInterfaceBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String JS_BRIDGE_ATTRIBUTE_VALUE = "value";

    @NotNull
    private final Context context;

    public UserJavascriptInterfaceBase(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlias$lambda$28(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addAlias(str, str2);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToCustomAttributeArray$lambda$21(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToCustomAttributeArray(str, str2);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToSubscriptionGroup$lambda$29(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.addToSubscriptionGroup(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$23(String str) {
        return a0.p("Failed to parse incrementCustomUserAttribute increment value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementCustomUserAttribute$lambda$24(String str, Integer num, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.incrementCustomUserAttribute(str, num.intValue());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseStringArrayFromJsonString$lambda$34() {
        return "Failed to parse custom attribute array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromCustomAttributeArray$lambda$22(String str, String str2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromCustomAttributeArray(str, str2);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromSubscriptionGroup$lambda$30(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.removeFromSubscriptionGroup(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCountry$lambda$9(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setCountry(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$31(String str, String str2) {
        return s.k("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$32(String str, String str2) {
        return s.k("Failed to parse custom attribute type for key: ", str, " and json string value: ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$25(String str) {
        return a0.p("Failed to parse setCustomLocationAttribute latitude value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$26(String str) {
        return a0.p("Failed to parse setCustomLocationAttribute longitude value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomLocationAttribute$lambda$27(String str, Double d3, Double d11, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLocationCustomAttribute(str, d3.doubleValue(), d11.doubleValue());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeArray$lambda$19(String str) {
        return f.k("Failed to set custom attribute array for key ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeArray$lambda$20(String str, String[] strArr, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setCustomAttributeArray(str, strArr);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeJSON$lambda$18(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z11, BrazeUser brazeUser) {
        brazeUser.getClass();
        userJavascriptInterfaceBase.setCustomAttribute(brazeUser, str, str2, z11);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$5(String str) {
        return a0.p("Failed to parse setDateOfBirth year value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$6(String str) {
        return f.k("Failed to parse setDateOfBirth month for value ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$7(String str) {
        return a0.p("Failed to parse setDateOfBirth day value '", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateOfBirth$lambda$8(Integer num, Month month, Integer num2, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setDateOfBirth(num.intValue(), month, num2.intValue());
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmail$lambda$2(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmail(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$12(String str) {
        return f.k("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmailNotificationSubscriptionType$lambda$13(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFirstName$lambda$0(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setFirstName(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$3(String str) {
        return f.k("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGender$lambda$4(Gender gender, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setGender(gender);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeCity$lambda$11(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setHomeCity(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLanguage$lambda$10(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLanguage(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastName$lambda$1(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLastName(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLineId$lambda$17(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setLineId(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPhoneNumber$lambda$16(String str, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPhoneNumber(str);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$14(String str) {
        return f.k("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPushNotificationSubscriptionType$lambda$15(NotificationSubscriptionType notificationSubscriptionType, BrazeUser brazeUser) {
        brazeUser.getClass();
        brazeUser.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.f26487a;
    }

    @JavascriptInterface
    public final void addAlias(@NotNull String alias, @NotNull String label) {
        alias.getClass();
        label.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new x0(alias, label, 3));
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new x0(key, value, 2));
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(@NotNull String subscriptionGroupId) {
        subscriptionGroupId.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(subscriptionGroupId, 5));
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(@NotNull String attribute, @NotNull String value) {
        attribute.getClass();
        value.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(value);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(value, 12), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new p(17, attribute, intOrNull));
        }
    }

    @Nullable
    public final Month monthFromInt(@NotNull String month) {
        int iIntValue;
        month.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(month);
        if (intOrNull == null || (iIntValue = intOrNull.intValue()) < 1 || iIntValue > 12) {
            return null;
        }
        return Month.INSTANCE.getMonth(iIntValue - 1);
    }

    @Nullable
    public final Gender parseGender(@NotNull String genderString) {
        genderString.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = genderString.toLowerCase(locale);
        lowerCase.getClass();
        Gender gender = Gender.MALE;
        if (Intrinsics.areEqual(lowerCase, gender.getValue())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (Intrinsics.areEqual(lowerCase, gender2.getValue())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (Intrinsics.areEqual(lowerCase, gender3.getValue())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (Intrinsics.areEqual(lowerCase, gender4.getValue())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (Intrinsics.areEqual(lowerCase, gender5.getValue())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (Intrinsics.areEqual(lowerCase, gender6.getValue())) {
            return gender6;
        }
        return null;
    }

    @Nullable
    public final String[] parseStringArrayFromJsonString(@Nullable String jsonArrayString) {
        try {
            JSONArray jSONArray = new JSONArray(jsonArrayString);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m(19), 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new x0(key, value, 1));
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(@NotNull String subscriptionGroupId) {
        subscriptionGroupId.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(subscriptionGroupId, 6));
    }

    @JavascriptInterface
    public final void setCountry(@Nullable String country) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(country, 7));
    }

    public final void setCustomAttribute(@NotNull BrazeUser user, @NotNull String key, @NotNull String jsonStringValue, boolean merge) {
        user.getClass();
        key.getClass();
        jsonStringValue.getClass();
        try {
            Object obj = new JSONObject(jsonStringValue).get("value");
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, merge);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new f1(key, jsonStringValue, 8), 6, (Object) null);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new f1(key, jsonStringValue, 9), 4, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(@NotNull String attribute, @NotNull String latitude, @NotNull String longitude) {
        attribute.getClass();
        latitude.getClass();
        longitude.getClass();
        Double dF = x.f(latitude);
        if (dF == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(latitude, 10), 6, (Object) null);
            return;
        }
        Double dF2 = x.f(longitude);
        if (dF2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(longitude, 11), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new y0(attribute, dF, dF2, 7));
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(@NotNull String key, @Nullable String jsonArrayString) {
        key.getClass();
        String[] stringArrayFromJsonString = parseStringArrayFromJsonString(jsonArrayString);
        if (stringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(key, 14), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new p(18, key, stringArrayFromJsonString));
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(@NotNull String key, @NotNull String jsonStringValue, boolean merge) {
        key.getClass();
        jsonStringValue.getClass();
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new a3.b(this, key, jsonStringValue, merge));
    }

    @JavascriptInterface
    public final void setDateOfBirth(@NotNull String year, @NotNull String month, @NotNull String day) {
        year.getClass();
        month.getClass();
        day.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(year);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(year, 16), 6, (Object) null);
            return;
        }
        Month monthMonthFromInt = monthFromInt(month);
        if (monthMonthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(month, 8), 6, (Object) null);
            return;
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(day);
        if (intOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(day, 9), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new y0(intOrNull, monthMonthFromInt, intOrNull2, 6));
        }
    }

    @JavascriptInterface
    public final void setEmail(@Nullable String email) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(email, 11));
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(@NotNull String subscriptionType) {
        subscriptionType.getClass();
        NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(subscriptionType, 7), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new c(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString, 0));
        }
    }

    @JavascriptInterface
    public final void setFirstName(@Nullable String firstName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(firstName, 8));
    }

    @JavascriptInterface
    public final void setGender(@NotNull String genderString) {
        genderString.getClass();
        Gender gender = parseGender(genderString);
        if (gender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(genderString, 13), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new c50.p(gender, 5));
        }
    }

    @JavascriptInterface
    public final void setHomeCity(@Nullable String homeCity) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(homeCity, 9));
    }

    @JavascriptInterface
    public final void setLanguage(@Nullable String language) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(language, 4));
    }

    @JavascriptInterface
    public final void setLastName(@Nullable String lastName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(lastName, 13));
    }

    @JavascriptInterface
    public final void setLineId(@Nullable String lineId) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(lineId, 12));
    }

    @JavascriptInterface
    public final void setPhoneNumber(@Nullable String phoneNumber) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new e(phoneNumber, 10));
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(@NotNull String subscriptionType) {
        subscriptionType.getClass();
        NotificationSubscriptionType notificationSubscriptionTypeSubscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (notificationSubscriptionTypeSubscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new n(subscriptionType, 15), 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new c(notificationSubscriptionTypeSubscriptionTypeFromJavascriptString, 1));
        }
    }

    @Nullable
    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(@Nullable String subscriptionType) {
        return NotificationSubscriptionType.INSTANCE.fromValue(subscriptionType);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u0007*\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase$Companion;", "", "<init>", "()V", "Lcom/braze/Braze;", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "", "block", "runOnUser", "(Lcom/braze/Braze;Lkotlin/jvm/functions/Function1;)V", "", "JS_BRIDGE_ATTRIBUTE_VALUE", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, Function1<? super BrazeUser, Unit> function1) {
            braze.getCurrentUser(new com.adyen.checkout.googlepay.internal.util.a(function1, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(Function1 function1, BrazeUser brazeUser) {
            brazeUser.getClass();
            function1.invoke(brazeUser);
        }

        private Companion() {
        }
    }
}
