package com.app.tgtg.model.local;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors;", "", "<init>", "()V", "Generic", "Offline", "NoResultsWithCurrentLocation", "NoResultWithFilterOn", "NoResultWithDiscoverSearch", "NoResultWithDiscoverSearchAndFilters", "NoLocationSelected", "LocationNotAvailable", "LocationServiceNotAvailable", "UnknownError", "NoOrders", "NoCo2eSaved", "NoRecipeFound", "NoRecipeSaved", "SharedRecipeNotAvailable", "MapViewTooWide", "Lcom/app/tgtg/model/local/GenericErrors$Generic;", "Lcom/app/tgtg/model/local/GenericErrors$LocationNotAvailable;", "Lcom/app/tgtg/model/local/GenericErrors$LocationServiceNotAvailable;", "Lcom/app/tgtg/model/local/GenericErrors$MapViewTooWide;", "Lcom/app/tgtg/model/local/GenericErrors$NoCo2eSaved;", "Lcom/app/tgtg/model/local/GenericErrors$NoLocationSelected;", "Lcom/app/tgtg/model/local/GenericErrors$NoOrders;", "Lcom/app/tgtg/model/local/GenericErrors$NoRecipeFound;", "Lcom/app/tgtg/model/local/GenericErrors$NoRecipeSaved;", "Lcom/app/tgtg/model/local/GenericErrors$NoResultWithDiscoverSearch;", "Lcom/app/tgtg/model/local/GenericErrors$NoResultWithDiscoverSearchAndFilters;", "Lcom/app/tgtg/model/local/GenericErrors$NoResultWithFilterOn;", "Lcom/app/tgtg/model/local/GenericErrors$NoResultsWithCurrentLocation;", "Lcom/app/tgtg/model/local/GenericErrors$Offline;", "Lcom/app/tgtg/model/local/GenericErrors$SharedRecipeNotAvailable;", "Lcom/app/tgtg/model/local/GenericErrors$UnknownError;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class GenericErrors {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$Generic;", "Lcom/app/tgtg/model/local/GenericErrors;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Generic extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        public static final Generic INSTANCE = new Generic();

        private Generic() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$LocationNotAvailable;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocationNotAvailable extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationNotAvailable(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$LocationServiceNotAvailable;", "Lcom/app/tgtg/model/local/GenericErrors;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocationServiceNotAvailable extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        public static final LocationServiceNotAvailable INSTANCE = new LocationServiceNotAvailable();

        private LocationServiceNotAvailable() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$MapViewTooWide;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MapViewTooWide extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapViewTooWide(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoCo2eSaved;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoCo2eSaved extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoCo2eSaved(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoLocationSelected;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoLocationSelected extends GenericErrors {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoLocationSelected(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }

        public final void setAction(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.action = function0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoOrders;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoOrders extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoOrders(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoRecipeFound;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoRecipeFound extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoRecipeFound(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoRecipeSaved;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoRecipeSaved extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoRecipeSaved(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoResultWithDiscoverSearch;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoResultWithDiscoverSearch extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultWithDiscoverSearch(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoResultWithDiscoverSearchAndFilters;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoResultWithDiscoverSearchAndFilters extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultWithDiscoverSearchAndFilters(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoResultWithFilterOn;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoResultWithFilterOn extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultWithFilterOn(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$NoResultsWithCurrentLocation;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "setAction", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoResultsWithCurrentLocation extends GenericErrors {
        public static final int $stable = 8;

        @NotNull
        private Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoResultsWithCurrentLocation(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }

        public final void setAction(@NotNull Function0<Unit> function0) {
            function0.getClass();
            this.action = function0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$Offline;", "Lcom/app/tgtg/model/local/GenericErrors;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Offline extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        public static final Offline INSTANCE = new Offline();

        private Offline() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$SharedRecipeNotAvailable;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SharedRecipeNotAvailable extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedRecipeNotAvailable(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/app/tgtg/model/local/GenericErrors$UnknownError;", "Lcom/app/tgtg/model/local/GenericErrors;", "action", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UnknownError extends GenericErrors {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull Function0<Unit> function0) {
            super(null);
            function0.getClass();
            this.action = function0;
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }
    }

    public /* synthetic */ GenericErrors(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GenericErrors() {
    }
}
