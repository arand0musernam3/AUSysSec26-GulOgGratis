package com.braze.managers;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.util.EnumSet] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.EnumSet] */
    public final EnumSet a(BrazeConfigurationProvider brazeConfigurationProvider) {
        brazeConfigurationProvider.getClass();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = EnumSet.of(LocationProviderName.PASSIVE, LocationProviderName.NETWORK);
        if (!brazeConfigurationProvider.getCustomLocationProviderNames().isEmpty()) {
            objectRef.element = brazeConfigurationProvider.getCustomLocationProviderNames();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ga0.c(objectRef, 11), 6, (Object) null);
        }
        T t9 = objectRef.element;
        t9.getClass();
        return (EnumSet) t9;
    }

    public static final String a(Ref.ObjectRef objectRef) {
        return j4.s.j(objectRef.element, "Using location providers: ");
    }
}
