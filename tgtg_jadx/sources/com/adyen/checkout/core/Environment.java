package com.adyen.checkout.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/core/Environment;", "Landroid/os/Parcelable;", "checkoutShopperBaseUrl", "Ljava/net/URL;", "checkoutAnalyticsBaseUrl", "(Ljava/net/URL;Ljava/net/URL;)V", "getCheckoutAnalyticsBaseUrl", "()Ljava/net/URL;", "getCheckoutShopperBaseUrl", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Environment implements Parcelable {

    @NotNull
    private final URL checkoutAnalyticsBaseUrl;

    @NotNull
    private final URL checkoutShopperBaseUrl;

    @NotNull
    public static final Parcelable.Creator<Environment> CREATOR = new Creator();

    @NotNull
    public static final Environment TEST = new Environment(new URL("https://checkoutshopper-test.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-test.adyen.com/checkoutanalytics/"));

    @NotNull
    public static final Environment EUROPE = new Environment(new URL("https://checkoutshopper-live.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live.adyen.com/checkoutanalytics/"));

    @NotNull
    public static final Environment UNITED_STATES = new Environment(new URL("https://checkoutshopper-live-us.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-us.adyen.com/checkoutanalytics/"));

    @NotNull
    public static final Environment AUSTRALIA = new Environment(new URL("https://checkoutshopper-live-au.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-au.adyen.com/checkoutanalytics/"));

    @NotNull
    public static final Environment INDIA = new Environment(new URL("https://checkoutshopper-live-in.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-in.adyen.com/checkoutanalytics/"));

    @NotNull
    public static final Environment APSE = new Environment(new URL("https://checkoutshopper-live-apse.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-apse.adyen.com/checkoutanalytics/"));

    @NotNull
    public static final Environment NEA = new Environment(new URL("https://checkoutshopper-live-nea.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-nea.adyen.com/checkoutanalytics/"));

    public Environment(@NotNull URL url, @NotNull URL url2) {
        url.getClass();
        url2.getClass();
        this.checkoutShopperBaseUrl = url;
        this.checkoutAnalyticsBaseUrl = url2;
    }

    public static /* synthetic */ Environment copy$default(Environment environment, URL url, URL url2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            url = environment.checkoutShopperBaseUrl;
        }
        if ((i11 & 2) != 0) {
            url2 = environment.checkoutAnalyticsBaseUrl;
        }
        return environment.copy(url, url2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final URL getCheckoutShopperBaseUrl() {
        return this.checkoutShopperBaseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final URL getCheckoutAnalyticsBaseUrl() {
        return this.checkoutAnalyticsBaseUrl;
    }

    @NotNull
    public final Environment copy(@NotNull URL checkoutShopperBaseUrl, @NotNull URL checkoutAnalyticsBaseUrl) {
        checkoutShopperBaseUrl.getClass();
        checkoutAnalyticsBaseUrl.getClass();
        return new Environment(checkoutShopperBaseUrl, checkoutAnalyticsBaseUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return Intrinsics.areEqual(this.checkoutShopperBaseUrl, environment.checkoutShopperBaseUrl) && Intrinsics.areEqual(this.checkoutAnalyticsBaseUrl, environment.checkoutAnalyticsBaseUrl);
    }

    @NotNull
    public final URL getCheckoutAnalyticsBaseUrl() {
        return this.checkoutAnalyticsBaseUrl;
    }

    @NotNull
    public final URL getCheckoutShopperBaseUrl() {
        return this.checkoutShopperBaseUrl;
    }

    public int hashCode() {
        return this.checkoutAnalyticsBaseUrl.hashCode() + (this.checkoutShopperBaseUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Environment(checkoutShopperBaseUrl=" + this.checkoutShopperBaseUrl + ", checkoutAnalyticsBaseUrl=" + this.checkoutAnalyticsBaseUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeSerializable(this.checkoutShopperBaseUrl);
        parcel.writeSerializable(this.checkoutAnalyticsBaseUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Environment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Environment createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Environment((URL) parcel.readSerializable(), (URL) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Environment[] newArray(int i11) {
            return new Environment[i11];
        }
    }
}
