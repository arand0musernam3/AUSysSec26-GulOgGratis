package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.q;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAFIntentWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n+ 2 MultiCatch.kt\ncom/appsflyer/internal/util/MultiCatchKt\n*L\n1#1,111:1\n16#2,7:112\n*S KotlinDebug\n*F\n+ 1 AFIntentWrapper.kt\ncom/appsflyer/internal/util/AFIntentWrapper\n*L\n84#1:112,7\n*E\n"})
public final class AFj1nSDK {

    @NotNull
    final Intent getMediationNetwork;

    public AFj1nSDK(@NotNull Intent intent) {
        intent.getClass();
        this.getMediationNetwork = intent;
    }

    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t9, boolean z11) {
        Object objInvoke;
        Object currencyIso4217Code;
        synchronized (this.getMediationNetwork) {
            try {
                o oVar = q.f40850b;
                objInvoke = function0.invoke();
            } finally {
            }
            KClass[] kClassArr = {Reflection.getOrCreateKotlinClass(ConcurrentModificationException.class), Reflection.getOrCreateKotlinClass(ArrayIndexOutOfBoundsException.class)};
            Throwable thA = q.a(objInvoke);
            if (thA != null) {
                try {
                    if (!y.v(kClassArr, Reflection.getOrCreateKotlinClass(thA.getClass()))) {
                        throw thA;
                    }
                    if (z11) {
                        currencyIso4217Code = getCurrencyIso4217Code(function0, str, t9, false);
                    } else {
                        AFLogger.afErrorLog(str, thA, false, false);
                        currencyIso4217Code = t9;
                    }
                    objInvoke = currencyIso4217Code;
                } catch (Throwable th2) {
                }
            }
            Throwable thA2 = q.a(objInvoke);
            if (thA2 == null) {
                t9 = (T) objInvoke;
            } else {
                AFLogger.afErrorLog(str, thA2, false, false);
            }
        }
        return t9;
    }

    public final boolean AFAdRevenueData(@NotNull final String str) {
        str.getClass();
        Boolean bool = (Boolean) getCurrencyIso4217Code(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1nSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1nSDK.this.getMediationNetwork.hasExtra(str));
            }
        }, a0.p("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final <T extends Parcelable> T H_(@NotNull final String str) {
        str.getClass();
        return (T) getCurrencyIso4217Code(new Function0<T>() { // from class: com.appsflyer.internal.AFj1nSDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1nSDK.this.getMediationNetwork.getParcelableExtra(str);
            }
        }, a0.p("Error while trying to read ", str, " extra from intent"), null, true);
    }

    @Nullable
    public final Intent I_(@NotNull final String str, final long j9) {
        str.getClass();
        return (Intent) getCurrencyIso4217Code(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1nSDK.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1nSDK.this.getMediationNetwork.putExtra(str, j9);
            }
        }, a0.p("Error while trying to write ", str, " extra to intent"), null, true);
    }

    @Nullable
    public final String getMediationNetwork(@NotNull final String str) {
        str.getClass();
        return (String) getCurrencyIso4217Code(new Function0<String>() { // from class: com.appsflyer.internal.AFj1nSDK.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1nSDK.this.getMediationNetwork.getStringExtra(str);
            }
        }, a0.p("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
