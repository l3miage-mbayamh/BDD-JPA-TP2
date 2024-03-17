## Reponse à la question de l'exo 3 du TP 2:
### les relations bidirectionnelles jouent un rôle important pour plusieurs raisons dont voici quelqu'unes:
1. **Intégrité de données:** elles garantissent la cohérence des données en s'assurant 
   que les modifications apportées à un entité sont propagées à l'autre entité liée.
    Par exemple dans notre cas  ici : les mises à jour des données du client seront automatiquement mise à jour dans la table commande
 et aussi on ne peut enregistrer  une commande sans un client.
2. **Facilitation d'accès aux données** : on peut naviguer facilement de deux cotés pour avoir accès à nos données 
Exemple : Dans la commande on peut avoir une commande spécifique à  un client donné.
Dans l'inverse , on peut avoir facilement la liste  des commandes effectués par un client spécifique.
3. *Performance des requètes* : une reduction de temps pour l'execution des requètes complèxe.
