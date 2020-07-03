//
// Created by LCX on 2020/7/3.
//


#include <malloc.h>
#include <memory.h>
#include "LinkedListHash.h"

HashTable* init_HashTable(){
    HashTable* hashTable = (HashTable*)malloc(sizeof(HashNode));
    if(hashTable == NULL)
        return NULL;
    memset(hashTable,0, sizeof(HashTable));
    return hashTable;
}
//插入
bool hash_addKey(HashTable* ht,DataType data)
{
//    if(hashTable == NULL)
//        return false;
//    HashNode *hashNode = (HashNode*)malloc(sizeof(HashNode));
//    if(hashNode == NULL)
//        return false;
//    memset(hashNode,0, sizeof(HashNode));
//    hashNode->data = data;
//    hashNode->next = NULL;
//    if(hashTable->hashKey[data%Len] == NULL) //空才可以插入
//    {
//        hashTable->hashKey[data%Len] = hashNode;
//    }
//    HashNode *tmp = hashTable->hashKey[data%Len];
//    while (tmp->next!=NULL){
//        tmp = tmp->next;
//    }
//    tmp->next = hashNode;
//    return true;
    HashNode* hashNode;
    if(ht == NULL)
        return false;
    hashNode = (HashNode *)malloc(sizeof(HashNode));
    if(hashNode == NULL)
        return false;
    memset(hashNode,0,sizeof(HashNode));
    hashNode->data =data;
    hashNode->next = NULL;

    if(NULL == ht->hashKey[data%6]){
        ht->hashKey[data%6] = hashNode;
    }
    HashNode* tmp =  ht->hashKey[data%6];
    while (NULL != tmp->next){
        tmp = tmp->next;
    }
    tmp->next = hashNode;
    return true;
}
//删除
bool hash_deleteKey(HashTable* hashTable,DataType data)
{

}
//修改
bool hash_modifyKey(HashTable* hashTable,DataType oldData,DataType newData)
{

}

//查找
HashNode* hash_lookup(HashTable *ht,DataType data)
{
//    if(hashTable == NULL)
//        return NULL;
//    HashNode *hashNode = (HashNode*)malloc(sizeof(HashNode));
//    if(hashNode == NULL || hashTable->hashKey[data%Len] == NULL)
//        return NULL;
//    memset(hashNode,0, sizeof(HashNode));
//    hashNode = hashTable->hashKey[data%Len]->next;
//    while (hashNode != NULL)
//    {
//        if(hashNode->data == data)
//            return hashNode;
//        hashNode = hashNode->next;
//    }
//    return NULL;
    HashNode* hNode;
    hNode = (HashNode *)malloc(sizeof(HashNode));
    memset(hNode,0,sizeof(HashNode));
    if(NULL == ht || ht->hashKey[data%6]== NULL)
        return NULL;

    hNode = ht->hashKey[data%6]->next;

    while (NULL != hNode){
        if(data == hNode->data)
            return hNode;
        hNode = hNode->next;
    }
    return NULL;
}

int main()
{

    printf("-------");
    HashTable * hashTable = init_HashTable();
    //hash_addKey(hashTable,3);
    hash_addKey(hashTable,1);
    hash_addKey(hashTable,2);
    hash_addKey(hashTable,3);
    hash_addKey(hashTable,4);

    printf("%d\n",hash_lookup(hashTable,2)->data);
    return 0;
}
