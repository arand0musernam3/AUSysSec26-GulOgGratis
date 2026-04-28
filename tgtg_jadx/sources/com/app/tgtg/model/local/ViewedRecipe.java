package com.app.tgtg.model.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/app/tgtg/model/local/ViewedRecipe;", "", "id", "", "recipeJson", "", "recipeName", "viewedAt", "<init>", "(JLjava/lang/String;Ljava/lang/String;J)V", "getId", "()J", "getRecipeJson", "()Ljava/lang/String;", "getRecipeName", "getViewedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ViewedRecipe {
    public static final int $stable = 0;
    private final long id;

    @NotNull
    private final String recipeJson;

    @NotNull
    private final String recipeName;
    private final long viewedAt;

    public ViewedRecipe(long j9, @NotNull String str, @NotNull String str2, long j11) {
        str.getClass();
        str2.getClass();
        this.id = j9;
        this.recipeJson = str;
        this.recipeName = str2;
        this.viewedAt = j11;
    }

    public static /* synthetic */ ViewedRecipe copy$default(ViewedRecipe viewedRecipe, long j9, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = viewedRecipe.id;
        }
        long j12 = j9;
        if ((i11 & 2) != 0) {
            str = viewedRecipe.recipeJson;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = viewedRecipe.recipeName;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            j11 = viewedRecipe.viewedAt;
        }
        return viewedRecipe.copy(j12, str3, str4, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecipeJson() {
        return this.recipeJson;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecipeName() {
        return this.recipeName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getViewedAt() {
        return this.viewedAt;
    }

    @NotNull
    public final ViewedRecipe copy(long id2, @NotNull String recipeJson, @NotNull String recipeName, long viewedAt) {
        recipeJson.getClass();
        recipeName.getClass();
        return new ViewedRecipe(id2, recipeJson, recipeName, viewedAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewedRecipe)) {
            return false;
        }
        ViewedRecipe viewedRecipe = (ViewedRecipe) other;
        return this.id == viewedRecipe.id && Intrinsics.areEqual(this.recipeJson, viewedRecipe.recipeJson) && Intrinsics.areEqual(this.recipeName, viewedRecipe.recipeName) && this.viewedAt == viewedRecipe.viewedAt;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getRecipeJson() {
        return this.recipeJson;
    }

    @NotNull
    public final String getRecipeName() {
        return this.recipeName;
    }

    public final long getViewedAt() {
        return this.viewedAt;
    }

    public int hashCode() {
        return Long.hashCode(this.viewedAt) + l1.b(l1.b(Long.hashCode(this.id) * 31, 31, this.recipeJson), 31, this.recipeName);
    }

    @NotNull
    public String toString() {
        long j9 = this.id;
        String str = this.recipeJson;
        String str2 = this.recipeName;
        long j11 = this.viewedAt;
        StringBuilder sb2 = new StringBuilder("ViewedRecipe(id=");
        sb2.append(j9);
        sb2.append(", recipeJson=");
        sb2.append(str);
        sb2.append(", recipeName=");
        sb2.append(str2);
        sb2.append(", viewedAt=");
        return a0.j(j11, ")", sb2);
    }

    public /* synthetic */ ViewedRecipe(long j9, String str, String str2, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j9, str, str2, j11);
    }
}
