package co.datadome.sdk;

import co.datadome.sdk.DataDomeSDK;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8650a;

    static {
        int[] iArr = new int[DataDomeSDK.BackBehaviour.values().length];
        try {
            iArr[DataDomeSDK.BackBehaviour.BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataDomeSDK.BackBehaviour.GO_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataDomeSDK.BackBehaviour.GO_BACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f8650a = iArr;
    }
}
