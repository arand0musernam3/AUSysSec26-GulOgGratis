package com.braze.support;

import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10752a;

    static {
        int[] iArr = new int[BrazeLogger.Priority.values().length];
        try {
            iArr[BrazeLogger.Priority.D.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BrazeLogger.Priority.I.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BrazeLogger.Priority.E.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BrazeLogger.Priority.W.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BrazeLogger.Priority.V.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f10752a = iArr;
    }
}
