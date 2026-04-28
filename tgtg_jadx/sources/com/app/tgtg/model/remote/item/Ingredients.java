package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cu.a;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00022\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ*\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u001a\u0010-\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010#R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001c¨\u00068"}, d2 = {"Lcom/app/tgtg/model/remote/item/Ingredients;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/item/Ingredient;", "listOfIngredients", "", "bagCount", "<init>", "(Ljava/util/List;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/Ingredients;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "isWithPhotoEnabled", "Ldv/b;", "getTrackingItem", "(Z)Ljava/util/List;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;I)Lcom/app/tgtg/model/remote/item/Ingredients;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getListOfIngredients", "getListOfIngredients$annotations", "()V", "I", "getBagCount", "getBagCount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIngredients.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ingredients.kt\ncom/app/tgtg/model/remote/item/Ingredients\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1586#2:52\n1661#2,3:53\n*S KotlinDebug\n*F\n+ 1 Ingredients.kt\ncom/app/tgtg/model/remote/item/Ingredients\n*L\n23#1:52\n23#1:53,3\n*E\n"})
public final /* data */ class Ingredients implements Parcelable {
    private final int bagCount;

    @NotNull
    private final List<Ingredient> listOfIngredients;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Ingredients> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new a(1)), null};

    public Ingredients(int i11, List list, int i12, m1 m1Var) {
        this.listOfIngredients = (i11 & 1) == 0 ? n0.f26529a : list;
        if ((i11 & 2) == 0) {
            this.bagCount = 0;
        } else {
            this.bagCount = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(Ingredient$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ingredients copy$default(Ingredients ingredients, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = ingredients.listOfIngredients;
        }
        if ((i12 & 2) != 0) {
            i11 = ingredients.bagCount;
        }
        return ingredients.copy(list, i11);
    }

    public static final void write$Self$app(Ingredients self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.listOfIngredients, n0.f26529a)) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.listOfIngredients);
        }
        if (!output.C(serialDesc) && self.bagCount == 0) {
            return;
        }
        output.m(1, self.bagCount, serialDesc);
    }

    @NotNull
    public final List<Ingredient> component1() {
        return this.listOfIngredients;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBagCount() {
        return this.bagCount;
    }

    @NotNull
    public final Ingredients copy(@NotNull List<Ingredient> listOfIngredients, int bagCount) {
        listOfIngredients.getClass();
        return new Ingredients(listOfIngredients, bagCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ingredients)) {
            return false;
        }
        Ingredients ingredients = (Ingredients) other;
        return Intrinsics.areEqual(this.listOfIngredients, ingredients.listOfIngredients) && this.bagCount == ingredients.bagCount;
    }

    public final int getBagCount() {
        return this.bagCount;
    }

    @NotNull
    public final List<Ingredient> getListOfIngredients() {
        return this.listOfIngredients;
    }

    @NotNull
    public final List<dv.b> getTrackingItem(boolean isWithPhotoEnabled) {
        List<Ingredient> list = this.listOfIngredients;
        ArrayList arrayList = new ArrayList(e0.o(list, 10));
        for (Ingredient ingredient : list) {
            arrayList.add(new TrackingIngredient(ingredient.getName(), ingredient.getProbabilityPercentage(), isWithPhotoEnabled ? Boolean.valueOf(ingredient.getImageUrl() != null) : null).parameters());
        }
        return arrayList;
    }

    public int hashCode() {
        return Integer.hashCode(this.bagCount) + (this.listOfIngredients.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Ingredients(listOfIngredients=" + this.listOfIngredients + ", bagCount=" + this.bagCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.listOfIngredients, dest);
        while (itR.hasNext()) {
            ((Ingredient) itR.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.bagCount);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/Ingredients$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/Ingredients;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Ingredients$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Ingredients> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Ingredients createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(Ingredient.CREATOR, parcel, arrayList, iC, 1);
            }
            return new Ingredients(arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Ingredients[] newArray(int i11) {
            return new Ingredients[i11];
        }
    }

    @g("bag_count")
    public static /* synthetic */ void getBagCount$annotations() {
    }

    @g("ingredient_labels")
    public static /* synthetic */ void getListOfIngredients$annotations() {
    }

    public Ingredients() {
        this((List) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public Ingredients(@NotNull List<Ingredient> list, int i11) {
        list.getClass();
        this.listOfIngredients = list;
        this.bagCount = i11;
    }

    public Ingredients(List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? n0.f26529a : list, (i12 & 2) != 0 ? 0 : i11);
    }
}
