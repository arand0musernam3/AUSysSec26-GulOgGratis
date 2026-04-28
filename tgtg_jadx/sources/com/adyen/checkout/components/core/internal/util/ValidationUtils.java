package com.adyen.checkout.components.core.internal.util;

import com.adyen.checkout.core.Environment;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/ValidationUtils;", "", "()V", "EMAIL_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "EMAIL_REGEX", "", "getEMAIL_REGEX$annotations", "LIVE_CLIENT_KEY_PATTERN", "PHONE_PATTERN", "PHONE_REGEX", "TEST_CLIENT_KEY_PATTERN", "isClientKeyValid", "", "clientKey", "environment", "Lcom/adyen/checkout/core/Environment;", "isClientKeyValid$components_core_release", "isEmailValid", "emailAddress", "isPhoneNumberValid", "phoneNumber", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ValidationUtils {

    @NotNull
    public static final ValidationUtils INSTANCE = new ValidationUtils();

    @NotNull
    private static final String EMAIL_REGEX = "^(([a-z0-9!#$%&'*+\\-/=?^_`{|}~]+(\\.[a-z0-9!#$%&'*+\\-/=?^_`{|}~]+)*)|(\".+\"))@((\\[((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}])|((?!-)[a-z0-9-]{1,63}(?<!-)(\\.[a-z0-9-]{1,63}(?<!-))*\\.[a-z]{2,}))$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX, 2);

    @NotNull
    private static final String PHONE_REGEX = "^\\D*(\\d\\D*){9,14}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
    private static final Pattern TEST_CLIENT_KEY_PATTERN = Pattern.compile("test_([a-zA-Z0-9]){32}");
    private static final Pattern LIVE_CLIENT_KEY_PATTERN = Pattern.compile("live_([a-zA-Z0-9]){32}");

    private ValidationUtils() {
    }

    public final boolean isClientKeyValid$components_core_release(@NotNull String clientKey, @NotNull Environment environment) {
        clientKey.getClass();
        environment.getClass();
        if (Intrinsics.areEqual(environment, Environment.TEST)) {
            return TEST_CLIENT_KEY_PATTERN.matcher(clientKey).matches();
        }
        if (Intrinsics.areEqual(environment, Environment.APSE) ? true : Intrinsics.areEqual(environment, Environment.AUSTRALIA) ? true : Intrinsics.areEqual(environment, Environment.EUROPE) ? true : Intrinsics.areEqual(environment, Environment.INDIA) ? true : Intrinsics.areEqual(environment, Environment.NEA) ? true : Intrinsics.areEqual(environment, Environment.UNITED_STATES)) {
            return LIVE_CLIENT_KEY_PATTERN.matcher(clientKey).matches();
        }
        return false;
    }

    public final boolean isEmailValid(@NotNull String emailAddress) {
        emailAddress.getClass();
        return EMAIL_PATTERN.matcher(emailAddress).matches();
    }

    public final boolean isPhoneNumberValid(@NotNull String phoneNumber) {
        phoneNumber.getClass();
        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }

    private static /* synthetic */ void getEMAIL_REGEX$annotations() {
    }
}
