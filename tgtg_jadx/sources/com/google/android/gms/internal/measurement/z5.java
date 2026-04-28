package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.attribution.RequestError;
import java.util.HashMap;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z5 extends n5 implements a6 {
    public static a6 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof a6 ? (a6) iInterfaceQueryLocalInterface : new y5(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean a(int i11, Parcel parcel, Parcel parcel2) {
        boolean z11;
        c6 b6Var = null;
        e6 d6Var = null;
        c6 b6Var2 = null;
        c6 b6Var3 = null;
        c6 b6Var4 = null;
        c6 b6Var5 = null;
        g6 f6Var = null;
        g6 f6Var2 = null;
        g6 f6Var3 = null;
        c6 b6Var6 = null;
        c6 b6Var7 = null;
        c6 b6Var8 = null;
        c6 b6Var9 = null;
        c6 b6Var10 = null;
        c6 b6Var11 = null;
        i6 h6Var = null;
        c6 b6Var12 = null;
        c6 b6Var13 = null;
        c6 b6Var14 = null;
        c6 b6Var15 = null;
        c6 b6Var16 = null;
        switch (i11) {
            case 1:
                yz.a aVarU = yz.b.U(parcel.readStrongBinder());
                j6 j6Var = (j6) o5.a(parcel, j6.CREATOR);
                long j9 = parcel.readLong();
                o5.d(parcel);
                initialize(aVarU, j6Var, j9);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                long j11 = parcel.readLong();
                o5.d(parcel);
                logEvent(string, string2, bundle, z12, z13, j11);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var = iInterfaceQueryLocalInterface instanceof c6 ? (c6) iInterfaceQueryLocalInterface : new b6(strongBinder);
                }
                c6 c6Var = b6Var;
                long j12 = parcel.readLong();
                o5.d(parcel);
                logEventAndBundle(string3, string4, bundle2, c6Var, j12);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                yz.a aVarU2 = yz.b.U(parcel.readStrongBinder());
                ClassLoader classLoader = o5.f11692a;
                z11 = parcel.readInt() != 0;
                long j13 = parcel.readLong();
                o5.d(parcel);
                setUserProperty(string5, string6, aVarU2, z11, j13);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = o5.f11692a;
                z11 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var16 = iInterfaceQueryLocalInterface2 instanceof c6 ? (c6) iInterfaceQueryLocalInterface2 : new b6(strongBinder2);
                }
                o5.d(parcel);
                getUserProperties(string7, string8, z11, b6Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var15 = iInterfaceQueryLocalInterface3 instanceof c6 ? (c6) iInterfaceQueryLocalInterface3 : new b6(strongBinder3);
                }
                o5.d(parcel);
                getMaxUserProperties(string9, b6Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j14 = parcel.readLong();
                o5.d(parcel);
                setUserId(string10, j14);
                break;
            case 8:
                Bundle bundle3 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j15 = parcel.readLong();
                o5.d(parcel);
                setConditionalUserProperty(bundle3, j15);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var14 = iInterfaceQueryLocalInterface4 instanceof c6 ? (c6) iInterfaceQueryLocalInterface4 : new b6(strongBinder4);
                }
                o5.d(parcel);
                getConditionalUserProperties(string13, string14, b6Var14);
                break;
            case 11:
                ClassLoader classLoader3 = o5.f11692a;
                z11 = parcel.readInt() != 0;
                long j16 = parcel.readLong();
                o5.d(parcel);
                setMeasurementEnabled(z11, j16);
                break;
            case 12:
                long j17 = parcel.readLong();
                o5.d(parcel);
                resetAnalyticsData(j17);
                break;
            case 13:
                long j18 = parcel.readLong();
                o5.d(parcel);
                setMinimumSessionDuration(j18);
                break;
            case 14:
                long j19 = parcel.readLong();
                o5.d(parcel);
                setSessionTimeoutDuration(j19);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                yz.a aVarU3 = yz.b.U(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j21 = parcel.readLong();
                o5.d(parcel);
                setCurrentScreen(aVarU3, string15, string16, j21);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var13 = iInterfaceQueryLocalInterface5 instanceof c6 ? (c6) iInterfaceQueryLocalInterface5 : new b6(strongBinder5);
                }
                o5.d(parcel);
                getCurrentScreenName(b6Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var12 = iInterfaceQueryLocalInterface6 instanceof c6 ? (c6) iInterfaceQueryLocalInterface6 : new b6(strongBinder6);
                }
                o5.d(parcel);
                getCurrentScreenClass(b6Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    h6Var = iInterfaceQueryLocalInterface7 instanceof i6 ? (i6) iInterfaceQueryLocalInterface7 : new h6(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                o5.d(parcel);
                setInstanceIdProvider(h6Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var11 = iInterfaceQueryLocalInterface8 instanceof c6 ? (c6) iInterfaceQueryLocalInterface8 : new b6(strongBinder8);
                }
                o5.d(parcel);
                getCachedAppInstanceId(b6Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var10 = iInterfaceQueryLocalInterface9 instanceof c6 ? (c6) iInterfaceQueryLocalInterface9 : new b6(strongBinder9);
                }
                o5.d(parcel);
                getAppInstanceId(b6Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var9 = iInterfaceQueryLocalInterface10 instanceof c6 ? (c6) iInterfaceQueryLocalInterface10 : new b6(strongBinder10);
                }
                o5.d(parcel);
                getGmpAppId(b6Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var8 = iInterfaceQueryLocalInterface11 instanceof c6 ? (c6) iInterfaceQueryLocalInterface11 : new b6(strongBinder11);
                }
                o5.d(parcel);
                generateEventId(b6Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j22 = parcel.readLong();
                o5.d(parcel);
                beginAdUnitExposure(string17, j22);
                break;
            case 24:
                String string18 = parcel.readString();
                long j23 = parcel.readLong();
                o5.d(parcel);
                endAdUnitExposure(string18, j23);
                break;
            case 25:
                yz.a aVarU4 = yz.b.U(parcel.readStrongBinder());
                long j24 = parcel.readLong();
                o5.d(parcel);
                onActivityStarted(aVarU4, j24);
                break;
            case 26:
                yz.a aVarU5 = yz.b.U(parcel.readStrongBinder());
                long j25 = parcel.readLong();
                o5.d(parcel);
                onActivityStopped(aVarU5, j25);
                break;
            case 27:
                yz.a aVarU6 = yz.b.U(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j26 = parcel.readLong();
                o5.d(parcel);
                onActivityCreated(aVarU6, bundle5, j26);
                break;
            case 28:
                yz.a aVarU7 = yz.b.U(parcel.readStrongBinder());
                long j27 = parcel.readLong();
                o5.d(parcel);
                onActivityDestroyed(aVarU7, j27);
                break;
            case 29:
                yz.a aVarU8 = yz.b.U(parcel.readStrongBinder());
                long j28 = parcel.readLong();
                o5.d(parcel);
                onActivityPaused(aVarU8, j28);
                break;
            case 30:
                yz.a aVarU9 = yz.b.U(parcel.readStrongBinder());
                long j29 = parcel.readLong();
                o5.d(parcel);
                onActivityResumed(aVarU9, j29);
                break;
            case BERTags.DATE /* 31 */:
                yz.a aVarU10 = yz.b.U(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var7 = iInterfaceQueryLocalInterface12 instanceof c6 ? (c6) iInterfaceQueryLocalInterface12 : new b6(strongBinder12);
                }
                long j31 = parcel.readLong();
                o5.d(parcel);
                onActivitySaveInstanceState(aVarU10, b6Var7, j31);
                break;
            case 32:
                Bundle bundle6 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var6 = iInterfaceQueryLocalInterface13 instanceof c6 ? (c6) iInterfaceQueryLocalInterface13 : new b6(strongBinder13);
                }
                long j32 = parcel.readLong();
                o5.d(parcel);
                performAction(bundle6, b6Var6, j32);
                break;
            case 33:
                int i12 = parcel.readInt();
                String string19 = parcel.readString();
                yz.a aVarU11 = yz.b.U(parcel.readStrongBinder());
                yz.a aVarU12 = yz.b.U(parcel.readStrongBinder());
                yz.a aVarU13 = yz.b.U(parcel.readStrongBinder());
                o5.d(parcel);
                logHealthData(i12, string19, aVarU11, aVarU12, aVarU13);
                break;
            case BERTags.DURATION /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    f6Var3 = iInterfaceQueryLocalInterface14 instanceof g6 ? (g6) iInterfaceQueryLocalInterface14 : new f6(strongBinder14);
                }
                o5.d(parcel);
                setEventInterceptor(f6Var3);
                break;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    f6Var2 = iInterfaceQueryLocalInterface15 instanceof g6 ? (g6) iInterfaceQueryLocalInterface15 : new f6(strongBinder15);
                }
                o5.d(parcel);
                registerOnMeasurementEventListener(f6Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    f6Var = iInterfaceQueryLocalInterface16 instanceof g6 ? (g6) iInterfaceQueryLocalInterface16 : new f6(strongBinder16);
                }
                o5.d(parcel);
                unregisterOnMeasurementEventListener(f6Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(o5.f11692a);
                o5.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var5 = iInterfaceQueryLocalInterface17 instanceof c6 ? (c6) iInterfaceQueryLocalInterface17 : new b6(strongBinder17);
                }
                int i13 = parcel.readInt();
                o5.d(parcel);
                getTestFlag(b6Var5, i13);
                break;
            case 39:
                ClassLoader classLoader4 = o5.f11692a;
                z11 = parcel.readInt() != 0;
                o5.d(parcel);
                setDataCollectionEnabled(z11);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var4 = iInterfaceQueryLocalInterface18 instanceof c6 ? (c6) iInterfaceQueryLocalInterface18 : new b6(strongBinder18);
                }
                o5.d(parcel);
                isDataCollectionEnabled(b6Var4);
                break;
            case RequestError.NO_DEV_KEY /* 41 */:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j33 = parcel.readLong();
                o5.d(parcel);
                clearMeasurementEnabled(j33);
                break;
            case 44:
                Bundle bundle8 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j34 = parcel.readLong();
                o5.d(parcel);
                setConsent(bundle8, j34);
                break;
            case 45:
                Bundle bundle9 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j35 = parcel.readLong();
                o5.d(parcel);
                setConsentThirdParty(bundle9, j35);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var3 = iInterfaceQueryLocalInterface19 instanceof c6 ? (c6) iInterfaceQueryLocalInterface19 : new b6(strongBinder19);
                }
                o5.d(parcel);
                getSessionId(b6Var3);
                break;
            case 48:
                Intent intent = (Intent) o5.a(parcel, Intent.CREATOR);
                o5.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                l6 l6Var = (l6) o5.a(parcel, l6.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j36 = parcel.readLong();
                o5.d(parcel);
                setCurrentScreenByScionActivityInfo(l6Var, string20, string21, j36);
                break;
            case 51:
                l6 l6Var2 = (l6) o5.a(parcel, l6.CREATOR);
                long j37 = parcel.readLong();
                o5.d(parcel);
                onActivityStartedByScionActivityInfo(l6Var2, j37);
                break;
            case 52:
                l6 l6Var3 = (l6) o5.a(parcel, l6.CREATOR);
                long j38 = parcel.readLong();
                o5.d(parcel);
                onActivityStoppedByScionActivityInfo(l6Var3, j38);
                break;
            case 53:
                l6 l6Var4 = (l6) o5.a(parcel, l6.CREATOR);
                Bundle bundle10 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j39 = parcel.readLong();
                o5.d(parcel);
                onActivityCreatedByScionActivityInfo(l6Var4, bundle10, j39);
                break;
            case 54:
                l6 l6Var5 = (l6) o5.a(parcel, l6.CREATOR);
                long j41 = parcel.readLong();
                o5.d(parcel);
                onActivityDestroyedByScionActivityInfo(l6Var5, j41);
                break;
            case 55:
                l6 l6Var6 = (l6) o5.a(parcel, l6.CREATOR);
                long j42 = parcel.readLong();
                o5.d(parcel);
                onActivityPausedByScionActivityInfo(l6Var6, j42);
                break;
            case 56:
                l6 l6Var7 = (l6) o5.a(parcel, l6.CREATOR);
                long j43 = parcel.readLong();
                o5.d(parcel);
                onActivityResumedByScionActivityInfo(l6Var7, j43);
                break;
            case 57:
                l6 l6Var8 = (l6) o5.a(parcel, l6.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    b6Var2 = iInterfaceQueryLocalInterface20 instanceof c6 ? (c6) iInterfaceQueryLocalInterface20 : new b6(strongBinder20);
                }
                long j44 = parcel.readLong();
                o5.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(l6Var8, b6Var2, j44);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    d6Var = iInterfaceQueryLocalInterface21 instanceof e6 ? (e6) iInterfaceQueryLocalInterface21 : new d6(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                }
                o5.d(parcel);
                retrieveAndUploadBatches(d6Var);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                long j45 = parcel.readLong();
                long j46 = parcel.readLong();
                o5.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z14, z15, j45, j46);
                break;
            case 60:
                yz.a aVarU14 = yz.b.U(parcel.readStrongBinder());
                j6 j6Var2 = (j6) o5.a(parcel, j6.CREATOR);
                long j47 = parcel.readLong();
                long j48 = parcel.readLong();
                o5.d(parcel);
                initializeWithElapsedTime(aVarU14, j6Var2, j47, j48);
                break;
            case 61:
                long j49 = parcel.readLong();
                long j51 = parcel.readLong();
                o5.d(parcel);
                resetAnalyticsDataWithElapsedTime(j49, j51);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
