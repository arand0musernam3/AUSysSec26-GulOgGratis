package com.braze.support;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f10763a = new k();

    public static final EnumSet a(Class cls, Set set) {
        cls.getClass();
        set.getClass();
        EnumSet enumSetNoneOf = EnumSet.noneOf(cls);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                enumSetNoneOf.add(Enum.valueOf(cls, upperCase));
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f10763a, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new mw.d(str, 19), 4, (Object) null);
            }
        }
        enumSetNoneOf.getClass();
        return enumSetNoneOf;
    }

    public static final String a(String str) {
        return e0.f.k("Failed to create valid enum from string: ", str);
    }

    public static final Set a(EnumSet enumSet) {
        enumSet.getClass();
        ArrayList arrayList = new ArrayList(e0.o(enumSet, 10));
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return CollectionsKt.v0(arrayList);
    }
}
