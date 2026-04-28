package com.app.tgtg.model.remote;

import a80.a;
import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import mv.v;
import mv.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u000eJ.\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u000eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0003\u0010*\u0012\u0004\b+\u0010,R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0004\u0010*\u0012\u0004\b-\u0010,R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010,\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u00100R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/FeatureActivation;", "Landroid/os/Parcelable;", "", "name", "version", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/FeatureActivation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/FeatureActivation;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName$annotations", "()V", "getVersion$annotations", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getDescription$annotations", "Lmv/v;", "getActivationName", "()Lmv/v;", "activationName", "Lmv/w;", "getActivationVersion", "()Lmv/w;", "activationVersion", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeatureActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeatureActivation.kt\ncom/app/tgtg/model/remote/FeatureActivation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1586#2:38\n1661#2,3:39\n1586#2:42\n1661#2,3:43\n*S KotlinDebug\n*F\n+ 1 FeatureActivation.kt\ncom/app/tgtg/model/remote/FeatureActivation\n*L\n24#1:38\n24#1:39,3\n31#1:42\n31#1:43,3\n*E\n"})
public final /* data */ class FeatureActivation implements Parcelable {

    @NotNull
    private String description;

    @NotNull
    private String name;

    @NotNull
    private String version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FeatureActivation> CREATOR = new Creator();

    public /* synthetic */ FeatureActivation(int i11, String str, String str2, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, FeatureActivation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.version = str2;
        this.description = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getVersion() {
        return this.version;
    }

    public static /* synthetic */ FeatureActivation copy$default(FeatureActivation featureActivation, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureActivation.name;
        }
        if ((i11 & 2) != 0) {
            str2 = featureActivation.version;
        }
        if ((i11 & 4) != 0) {
            str3 = featureActivation.description;
        }
        return featureActivation.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(FeatureActivation self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.q(serialDesc, 1, self.version);
        output.q(serialDesc, 2, self.description);
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final FeatureActivation copy(@NotNull String name, @NotNull String version, @NotNull String description) {
        name.getClass();
        version.getClass();
        description.getClass();
        return new FeatureActivation(name, version, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureActivation)) {
            return false;
        }
        FeatureActivation featureActivation = (FeatureActivation) other;
        return Intrinsics.areEqual(this.name, featureActivation.name) && Intrinsics.areEqual(this.version, featureActivation.version) && Intrinsics.areEqual(this.description, featureActivation.description);
    }

    @NotNull
    public final v getActivationName() {
        a aVarA = v.a();
        ArrayList arrayList = new ArrayList(e0.o(aVarA, 10));
        Iterator<E> it = aVarA.iterator();
        while (it.hasNext()) {
            arrayList.add(((v) it.next()).name());
        }
        return arrayList.contains(this.name) ? v.valueOf(this.name) : v.DEFAULT;
    }

    @NotNull
    public final w getActivationVersion() {
        a aVarA = w.a();
        ArrayList arrayList = new ArrayList(e0.o(aVarA, 10));
        Iterator<E> it = aVarA.iterator();
        while (it.hasNext()) {
            arrayList.add(((w) it.next()).name());
        }
        return arrayList.contains(this.version) ? w.valueOf(this.version) : w.DEFAULT;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return this.description.hashCode() + l1.b(this.name.hashCode() * 31, 31, this.version);
    }

    public final void setDescription(@NotNull String str) {
        str.getClass();
        this.description = str;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.version;
        return k.p(f.t("FeatureActivation(name=", str, ", version=", str2, ", description="), this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        dest.writeString(this.version);
        dest.writeString(this.description);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/FeatureActivation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/FeatureActivation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FeatureActivation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureActivation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureActivation createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FeatureActivation(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureActivation[] newArray(int i11) {
            return new FeatureActivation[i11];
        }
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("name")
    private static /* synthetic */ void getName$annotations() {
    }

    @g("version")
    private static /* synthetic */ void getVersion$annotations() {
    }

    public FeatureActivation(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.name = str;
        this.version = str2;
        this.description = str3;
    }
}
