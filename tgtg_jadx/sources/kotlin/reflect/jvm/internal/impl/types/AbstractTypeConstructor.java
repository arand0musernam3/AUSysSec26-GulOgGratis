package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {
    private final boolean shouldReportCyclicScopeWithCompanionWarning;

    @NotNull
    private final NotNullLazyValue<Supertypes> supertypes;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class Supertypes {

        @NotNull
        private final Collection<KotlinType> allSupertypes;

        @NotNull
        private List<? extends KotlinType> supertypesWithoutCycles;

        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(@NotNull Collection<? extends KotlinType> collection) {
            collection.getClass();
            this.allSupertypes = collection;
            this.supertypesWithoutCycles = c0.c(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes());
        }

        @NotNull
        public final Collection<KotlinType> getAllSupertypes() {
            return this.allSupertypes;
        }

        @NotNull
        public final List<KotlinType> getSupertypesWithoutCycles() {
            return this.supertypesWithoutCycles;
        }

        public final void setSupertypesWithoutCycles(@NotNull List<? extends KotlinType> list) {
            list.getClass();
            this.supertypesWithoutCycles = list;
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        storageManager.getClass();
        this.supertypes = storageManager.createLazyValueWithPostCompute(new Function0<Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final AbstractTypeConstructor.Supertypes invoke() {
                return new AbstractTypeConstructor.Supertypes(this.this$0.computeSupertypes());
            }
        }, new Function1<Boolean, Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$2
            @NotNull
            public final AbstractTypeConstructor.Supertypes invoke(boolean z11) {
                return new AbstractTypeConstructor.Supertypes(c0.c(ErrorUtils.INSTANCE.getErrorTypeForLoopInSupertypes()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Boolean) obj).booleanValue());
            }
        }, new Function1<Supertypes, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3
            {
                super(1);
            }

            public final void invoke(@NotNull AbstractTypeConstructor.Supertypes supertypes) {
                supertypes.getClass();
                SupertypeLoopChecker supertypeLoopChecker = this.this$0.getSupertypeLoopChecker();
                AbstractTypeConstructor abstractTypeConstructor = this.this$0;
                Collection<KotlinType> allSupertypes = supertypes.getAllSupertypes();
                final AbstractTypeConstructor abstractTypeConstructor2 = this.this$0;
                Function1<TypeConstructor, Iterable<? extends KotlinType>> function1 = new Function1<TypeConstructor, Iterable<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
                        typeConstructor.getClass();
                        return abstractTypeConstructor2.computeNeighbours(typeConstructor, false);
                    }
                };
                final AbstractTypeConstructor abstractTypeConstructor3 = this.this$0;
                Collection<KotlinType> collectionFindLoopsInSupertypesAndDisconnect = supertypeLoopChecker.findLoopsInSupertypesAndDisconnect(abstractTypeConstructor, allSupertypes, function1, new Function1<KotlinType, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
                    {
                        super(1);
                    }

                    public final void invoke(@NotNull KotlinType kotlinType) {
                        kotlinType.getClass();
                        abstractTypeConstructor3.reportSupertypeLoopError(kotlinType);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((KotlinType) obj);
                        return Unit.f26487a;
                    }
                });
                if (collectionFindLoopsInSupertypesAndDisconnect.isEmpty()) {
                    KotlinType kotlinTypeDefaultSupertypeIfEmpty = this.this$0.defaultSupertypeIfEmpty();
                    collectionFindLoopsInSupertypesAndDisconnect = kotlinTypeDefaultSupertypeIfEmpty != null ? c0.c(kotlinTypeDefaultSupertypeIfEmpty) : null;
                    if (collectionFindLoopsInSupertypesAndDisconnect == null) {
                        collectionFindLoopsInSupertypesAndDisconnect = n0.f26529a;
                    }
                }
                if (this.this$0.getShouldReportCyclicScopeWithCompanionWarning()) {
                    SupertypeLoopChecker supertypeLoopChecker2 = this.this$0.getSupertypeLoopChecker();
                    final AbstractTypeConstructor abstractTypeConstructor4 = this.this$0;
                    Function1<TypeConstructor, Iterable<? extends KotlinType>> function12 = new Function1<TypeConstructor, Iterable<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final Iterable<KotlinType> invoke(@NotNull TypeConstructor typeConstructor) {
                            typeConstructor.getClass();
                            return abstractTypeConstructor4.computeNeighbours(typeConstructor, true);
                        }
                    };
                    final AbstractTypeConstructor abstractTypeConstructor5 = this.this$0;
                    supertypeLoopChecker2.findLoopsInSupertypesAndDisconnect(abstractTypeConstructor4, collectionFindLoopsInSupertypesAndDisconnect, function12, new Function1<KotlinType, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.3
                        {
                            super(1);
                        }

                        public final void invoke(@NotNull KotlinType kotlinType) {
                            kotlinType.getClass();
                            abstractTypeConstructor5.reportScopesLoopError(kotlinType);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((KotlinType) obj);
                            return Unit.f26487a;
                        }
                    });
                }
                AbstractTypeConstructor abstractTypeConstructor6 = this.this$0;
                List<KotlinType> listR0 = collectionFindLoopsInSupertypesAndDisconnect instanceof List ? (List) collectionFindLoopsInSupertypesAndDisconnect : null;
                if (listR0 == null) {
                    listR0 = CollectionsKt.r0(collectionFindLoopsInSupertypesAndDisconnect);
                }
                supertypes.setSupertypesWithoutCycles(abstractTypeConstructor6.processSupertypesWithoutCycles(listR0));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractTypeConstructor.Supertypes) obj);
                return Unit.f26487a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<KotlinType> computeNeighbours(TypeConstructor typeConstructor, boolean z11) {
        AbstractTypeConstructor abstractTypeConstructor = typeConstructor instanceof AbstractTypeConstructor ? (AbstractTypeConstructor) typeConstructor : null;
        if (abstractTypeConstructor != null) {
            return CollectionsKt.d0(abstractTypeConstructor.getAdditionalNeighboursInSupertypeGraph(z11), ((Supertypes) abstractTypeConstructor.supertypes.invoke()).getAllSupertypes());
        }
        Collection<KotlinType> collectionMo978getSupertypes = typeConstructor.mo978getSupertypes();
        collectionMo978getSupertypes.getClass();
        return collectionMo978getSupertypes;
    }

    @NotNull
    public abstract Collection<KotlinType> computeSupertypes();

    @Nullable
    public KotlinType defaultSupertypeIfEmpty() {
        return null;
    }

    @NotNull
    public Collection<KotlinType> getAdditionalNeighboursInSupertypeGraph(boolean z11) {
        return n0.f26529a;
    }

    public boolean getShouldReportCyclicScopeWithCompanionWarning() {
        return this.shouldReportCyclicScopeWithCompanionWarning;
    }

    @NotNull
    public abstract SupertypeLoopChecker getSupertypeLoopChecker();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getSupertypes */
    public List<KotlinType> mo978getSupertypes() {
        return ((Supertypes) this.supertypes.invoke()).getSupertypesWithoutCycles();
    }

    @NotNull
    public List<KotlinType> processSupertypesWithoutCycles(@NotNull List<KotlinType> list) {
        list.getClass();
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        kotlinTypeRefiner.getClass();
        return new ModuleViewTypeConstructor(this, kotlinTypeRefiner);
    }

    public void reportScopesLoopError(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    public void reportSupertypeLoopError(@NotNull KotlinType kotlinType) {
        kotlinType.getClass();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public final class ModuleViewTypeConstructor implements TypeConstructor {

        @NotNull
        private final KotlinTypeRefiner kotlinTypeRefiner;

        @NotNull
        private final j refinedSupertypes$delegate;
        final /* synthetic */ AbstractTypeConstructor this$0;

        public ModuleViewTypeConstructor(@NotNull final AbstractTypeConstructor abstractTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            this.this$0 = abstractTypeConstructor;
            this.kotlinTypeRefiner = kotlinTypeRefiner;
            this.refinedSupertypes$delegate = l.a(m.PUBLICATION, new Function0<List<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$ModuleViewTypeConstructor$refinedSupertypes$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final List<KotlinType> invoke() {
                    return KotlinTypeRefinerKt.refineTypes(this.this$0.kotlinTypeRefiner, abstractTypeConstructor.mo978getSupertypes());
                }
            });
        }

        private final List<KotlinType> getRefinedSupertypes() {
            return (List) this.refinedSupertypes$delegate.getValue();
        }

        public boolean equals(@Nullable Object obj) {
            return this.this$0.equals(obj);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = this.this$0.getBuiltIns();
            builtIns.getClass();
            return builtIns;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo977getDeclarationDescriptor() {
            return this.this$0.mo977getDeclarationDescriptor();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> parameters = this.this$0.getParameters();
            parameters.getClass();
            return parameters;
        }

        public int hashCode() {
            return this.this$0.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return this.this$0.isDenotable();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            kotlinTypeRefiner.getClass();
            return this.this$0.refine(kotlinTypeRefiner);
        }

        @NotNull
        public String toString() {
            return this.this$0.toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        @NotNull
        /* JADX INFO: renamed from: getSupertypes */
        public List<KotlinType> mo978getSupertypes() {
            return getRefinedSupertypes();
        }
    }
}
